package model;

public class Room { //Vorlage für alle Räume, Vorbereitung für die Räume, die in der CampusLocation-Klasse verwendet werden
    private String id; //Attribute beschreiben, welche Information jeder Raum besitzt; id... eindeutige Kennung des Raums
    private String name; //Bezeichnung des Raums
    private String roomnumber;

    public Room(String id, String name, String roomnumber) { //Konstruktor, der wird automatisch ausgeführt sibald man einen neuen Raum erstellt
    this.id = id; //this.id...Attribut; id.. ist der Wert, den der Konstruktur als Paramater erhält
    this.name = name;
    this.roomnumber = roomnumber;
} 
public String getid() { //gespeicherte id abfragen
    return id;
}

public String getname() {
    return name;

}

public String getroomnumber(){
    return roomnumber;
}

}
