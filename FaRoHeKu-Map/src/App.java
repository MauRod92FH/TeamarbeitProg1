import model.Building;
import view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Beginn: Suchfunktion testen; benötigte Klassen für den Test der Raumsuche
import java.util.List;
import model.CampusLocation;
import model.Room;
import service.SearchService;
//Ende: Imports für Raumsuche

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Building fhCampus = null;

    
        MainView mainView = new MainView(fhCampus);

        Scene scene = new Scene(mainView, 700, 680);
        primaryStage.setTitle("FaRoHeKu-Map");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Beginn: Suchfunktion testen
        CampusLocation campus = new CampusLocation(); //SearchService erstellen, un nach Räumen suchen zu können
        SearchService searchService = new SearchService();

        List<Room> results = searchService.searchRooms(campus.getRooms(), "BE07");
        for (Room room : results) { //gefunden Räume in Terminal
            String name = room.getname(); //Raumbezeichnung auslesen

            if  (name == null || name.isBlank()){ //prüfen, ob Raumbezeichnung vorhanden ist
                name = "Keine Raumbezeichnung";
            }
            //Gefundene Räume im Terminal anzeigen
            System.out.println(room.getroomnumber() + " - " + name);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}