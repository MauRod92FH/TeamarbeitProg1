package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Room;

public class SearchService {
    //Sucht nach Raumnummer, Name, Typ; Groß- und Kleinschreibung wird ignoriert; Ziele auch ohne Raumnummer auffindbar
    //Raum Bezeichung mit null beachten
    public List<Room> searchRooms(List<Room> rooms, String searchText) {
       
        List<Room> results = new ArrayList<>();

        if (rooms == null || searchText == null || searchText.isBlank()) {
            return results;
        }
        String search = searchText.trim().toLowerCase(Locale.ROOT).replace(".", "");//Benutzereingabe vereinheitlichen; Groß- & Kleinschreibung und Punkte ignorieren
         for(Room room : rooms) {
            if (room == null) {
                continue;
            }
            String roomNumber = room.getroomnumber();
            String roomName = room.getname();

            boolean numberMatches = roomNumber != null && roomNumber.toLowerCase(Locale.ROOT).replace(".", "").contains(search);
            boolean nameMatches = roomName != null && roomName.toLowerCase(Locale.ROOT).contains(search);

            if (numberMatches || nameMatches) {
                results.add(room);
            }
         }
         return results;

    }
}
