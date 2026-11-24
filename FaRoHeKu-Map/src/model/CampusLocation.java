package model;

import java.util.ArrayList;
import java.util.List;

public class CampusLocation {

/* Gemeinsame Grundlage für alle auffindbaren oder als Ziel auswählbaren Orte: Räume, Lernflächen, Eingänge
Name, Ebene, Gebäudebereich und Kategorie jedes Ortes
 */
private List<Room> rooms = new Arraylist<>();
public CampusLocation(){

//Ebene: A.E
rooms.add(new Room("AE01", "ÖH Büro", "A.E.01" ));
rooms.add(new Room("AE02", "Bibliothek", "A.E.02"));
rooms.add(new Room("AE03", "Bibliothek", "A.E.03")); //noch ein Zugang mit A.E.03, Bib hat drei Eingänge
rooms.add(new Room("AE04", "Technikraum", "A.E.04"));
rooms.add(new Room("AE09", "Technikraum", "A.E.09")); //Zugang zu A.E.10-11
rooms.add(new Room("AE12", "Technikraum", "A.E.12"));

//Ebene: B.E
rooms.add(new Room("BE01", "Festsaal", "B.E.01"));
rooms.add(new Room("BE02", "Festsaal", "B.E.02"));
rooms.add(new Room("BE03", "Festsaal", "B.E.03"));
rooms.add(new Room("BE04", "Lagerraum", "B.E.04"));
rooms.add(new Room("BE05", "WC Barrierefrei", "B.E.05"));
rooms.add(new Room("BE06", "WC", "B.E.06"));
rooms.add(new Room("BE07", null, "B.E.07")); //Zugang zu B.E.09-12
rooms.add(new Room("BE08", "Kopierraum", "B.E.08"));
rooms.add(new Room("BE14", "Müllraum", "B.E.14"));

//Ebene: C.E
rooms.add(new Room("CE01", "Lehrsaal", "C.E.01"));
rooms.add(new Room("CE02", "Lehrsaal", "C.E.02"));
rooms.add(new Room("CE03", "Analyse", "C.E.03"));
rooms.add(new Room("CE04", "Technikraum", "C.E.04"));
rooms.add(new Room("CE05", "Lagerraum", "C.E.05"));
rooms.add(new Room("CE06", "Raum der Stille", "C.E.06")); //Zugang zu C.E.07-08
rooms.add(new Room("CE09", "Garderobe M", "C.E.09")); //+ Dusche M
rooms.add(new Room("CE10", "Technikraum", "C.E.10"));
rooms.add(new Room("CE11", "Technikraum", "C.E.11"));
rooms.add(new Room("CE12", "Garderobe F", "C.E.12"));
rooms.add(new Room("CE13", "3D-Lab", "C.E.13"));
rooms.add(new Room("CE14", "VR-Lab", "C.E.14"));
rooms.add(new Room("CE15", "2D-Lab", "C.E.15"));
rooms.add(new Room("CE16", "Analyse", "C.E.16"));
rooms.add(new Room("CE17", "Performance Lab", "C.E.17"));
rooms.add(new Room("CE18", "Medizinische Trainingstherapie", "C.E.18"));
rooms.add(new Room("CE19", "Funktionsraum", "C.E.19"));
rooms.add(new Room("CE20", "Lehrsaal", "C.E.20"));
rooms.add(new Room("CE21", "Lehrsaal", "C.E.21"));

//Ebene: D.E
rooms.add(new Room("DE01", "L2 Labor", "D.E.01")); // Zugang zu D.E.01 - 21

//Ebene: C.Z
rooms.add(new Room("CZ01", "Lehrsaal", "C.Z.01"));
rooms.add(new Room("CZ02", "Lagerraum", "C.Z.02"));
rooms.add(new Room("CZ03", "Lehrsaal", "C.Z.03"));
rooms.add(new Room("CZ04", "Lehrsaal", "C.Z.04"));
rooms.add(new Room("CZ05", "Lehrsaal", "C.Z.05"));
rooms.add(new Room("CZ06", "WC", "C.Z.06")); //+Barrierefrei
rooms.add(new Room("CZ08a", "Lehrsaal", "C.Z.08a"));
rooms.add(new Room("CZ08b", "Infrastrukturmanagement", "C.Z.08b")); //Reinigung und Veranstaltungsdienst
rooms.add(new Room("CZ09", "Lehrsaal", "C.Z.09"));
rooms.add(new Room("CZ10", "Lehrsaal", "C.Z.10"));
rooms.add(new Room("CZ11", "Technikraum", "C.Z.11"));
rooms.add(new Room("CZ12", "Lehrsaal", "C.Z.12"));
rooms.add(new Room("CZ13", "Lehrsaal", "C.Z.13"));
rooms.add(new Room("CZ14", "Technikraum", "C.Z.14"));
rooms.add(new Room("CZ15", "Infrastrukturmanagement", "C.Z.15"));
rooms.add(new Room("CZ16", "Technikraum", "C.Z.16"));
rooms.add(new Room("CZ17", "Lagerraum", "C.Z.17"));
rooms.add(new Room("CZ18", "Lehrsaal", "C.Z.18"));
rooms.add(new Room("CZ19", "EDV-Lehrsaal", "C.Z.19"));
rooms.add(new Room("CZ20", null, "C.Z.20"));
rooms.add(new Room("CZ21", "EDV-Lehrsaal", "C.Z.21"));
rooms.add(new Room("CZ22", "VERT Labor", "C.Z.22"));
rooms.add(new Room("CZ23", null, "C.Z.23"));

//Ebene: D.Z
rooms.add(new Room("DZ01", "Labor Immunologie", "D.Z.01"));
rooms.add(new Room("DZ02", null, "D.Z.02"));
rooms.add(new Room("DZ03", "Labor Immunologie", "D.Z.03"));
rooms.add(new Room("DZ04", null, "D.Z.04")); 
rooms.add(new Room("DZ05", "Labor Immunhämatologie", "D.Z.05"));
rooms.add(new Room("DZ06", "Labor Hämatologie, Immunhämatologie", "D.Z.06"));
rooms.add(new Room("DZ07", "Labor Hämatologie, Immunhämatologie", "D.Z.07"));
rooms.add(new Room("DZ08", "Lagerraum", "D.Z.08"));
rooms.add(new Room("DZ09", "Besprechungsraum", "D.Z.09"));
rooms.add(new Room("DZ10", "Mikroskopiersaal", "D.Z.10"));
rooms.add(new Room("DZ11", "Technikraum", "D.Z.11"));
rooms.add(new Room("DZ12", "Technikraum", "D.Z.12"));
rooms.add(new Room("DZ13", "Technikraum", "D.Z.13"));
rooms.add(new Room("DZ14", "Labor Zytologie", "D.Z.14"));
rooms.add(new Room("DZ16", "Labor Zytologie", "D.Z.16"));
rooms.add(new Room("DZ17", "WC Mitarbeiter*innen", "D.Z.17"));
rooms.add(new Room("DZ19", null, "D.Z.19"));
rooms.add(new Room("DZ20", "Labor Zytologie", "D.Z.20"));
rooms.add(new Room("DZ21", "Biomedizinische Analytik Büro", "D.Z.21"));
rooms.add(new Room("DZ22", "Biomedizinische Analytik Büro", "D.Z.22"));
rooms.add(new Room("DZ23", "Biomedizinische Analytik Büro", "D.Z.23"));
rooms.add(new Room("DZ24", "Biomedizinische Analytik Büro", "D.Z.24"));
rooms.add(new Room("DZ25", "Biomedizinische Analytik Büro", "D.Z.25"));
rooms.add(new Room("DZ26", "Besprechungsraum", "D.Z.26"));
rooms.add(new Room("DZ27", "Küche Mitarbeiter*innen", "D.Z.27"));
rooms.add(new Room("DZ28", "Kopierraum", "D.Z.28"));
rooms.add(new Room("DZ30", "Biomedizinische Analytik Administration", "D.Z.30")); //Funktionsdiagnostik, Histopathologie, Zytologie; Zugang zu D.Z.32 - 33
rooms.add(new Room("DZ31", "Biomedizinische Analytik Administration", "D.Z.31")); //Zugang zu D.Z.32-33

// Ebene: A.1
rooms.add(new Room("A101", "Lehrsaal", "A.1.01"));
rooms.add(new Room("A102a", null, "A.1.02a"));
rooms.add(new Room("A103", "Lehrsaal", "A.1.03"));
rooms.add(new Room("A104", "Technikraum", "A.1.04"));
rooms.add(new Room("A105", "Lehrsaal", "A.1.05"));
rooms.add(new Room("A106", "Technikraum", "A.1.06"));
rooms.add(new Room("A107", "Lagerraum", "A.1.07"));
rooms.add(new Room("A108", "WC", "A.1.08"));
rooms.add(new Room("A109", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.09"));
rooms.add(new Room("A110", "WC Mitarbeiter*innen", "A.1.10"));
rooms.add(new Room("A111", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.11"));
rooms.add(new Room("A112", "Tax Management", "A.1.12"));
rooms.add(new Room("A113", "Lehrsaal", "A.1.13"));
rooms.add(new Room("A114", "Tax Management", "A.1.14"));
rooms.add(new Room("A115", "PHOENIX CONTACT Labor", "A.1.15"));
rooms.add(new Room("A116", "Lehrsaal", "A.1.16"));
rooms.add(new Room("A117", null, "A.1.17"));
rooms.add(new Room("A118", null, "A.1.18"));

// Ebene: B.1
rooms.add(new Room("B101", "Lehrsaal", "B.1.01"));
rooms.add(new Room("B102", "Lehrsaal", "B.1.02"));
rooms.add(new Room("B103", "Lehrsaal", "B.1.03"));
rooms.add(new Room("B104", "Tax Management", "B.1.04"));
rooms.add(new Room("B105", "Lehrsaal", "B.1.05"));
rooms.add(new Room("B106", "EDV-Lehrsaal", "B.1.06"));
rooms.add(new Room("B107", "EDV-Lehrsaal", "B.1.07"));
rooms.add(new Room("B108", "EDV-Lehrsaal", "B.1.08"));
rooms.add(new Room("B109", "IT-Services", "B.1.09"));
rooms.add(new Room("B110", "EDV-Lehrsaal", "B.1.10"));
rooms.add(new Room("B111", "Elektroniklabor", "B.1.11")); // Zugang zu B.1.12
rooms.add(new Room("B113", "WC", "B.1.13"));
rooms.add(new Room("B114", "WC", "B.1.14"));
rooms.add(new Room("B115", "IT-Services", "B.1.15"));
rooms.add(new Room("B116", "IT-Services", "B.1.16"));
rooms.add(new Room("B117", "Technikraum", "B.1.17")); // Zugang zu B.1.20
rooms.add(new Room("B118", "IT-Services", "B.1.18"));
rooms.add(new Room("B121", "Technikraum", "B.1.21"));
rooms.add(new Room("B122", "Küche Mitarbeiter*innen", "B.1.22"));
rooms.add(new Room("B123", "IT-Services", "B.1.23"));
rooms.add(new Room("B124", "Netzwerklabor", "B.1.24")); // Zugang zu B.1.25
rooms.add(new Room("B126", "IT-Services", "B.1.26")); // Zugang zu B.1.27-30

// Ebene: C.1
rooms.add(new Room("C101", "Selbsthilferaum", "C.1.01"));
rooms.add(new Room("C102", "Mikroskopiersaal", "C.1.02"));
rooms.add(new Room("C103", "Selbsthilferaum", "C.1.03"));
rooms.add(new Room("C104", "Mikroskopiersaal", "C.1.04"));
rooms.add(new Room("C105", "Lagerraum", "C.1.05"));
rooms.add(new Room("C106", "WC", "C.1.06")); // Zugang zu C.1.07
rooms.add(new Room("C108a", "Lagerraum", "C.1.08a"));
rooms.add(new Room("C108b", null, "C.1.08b"));
rooms.add(new Room("C109", "Funktionsdiagnostik", "C.1.09"));
rooms.add(new Room("C110", "Garderobe Lehrende F", "C.1.10"));
rooms.add(new Room("C111", "Technikraum", "C.1.11"));
rooms.add(new Room("C112", "Garderobe Lehrende F", "C.1.12"));
rooms.add(new Room("C113", "Garderrobe F", "C.1.13"));
rooms.add(new Room("C114", "Technikraum", "C.1.14"));
rooms.add(new Room("C115", "Lagerraum", "C.1.15"));
rooms.add(new Room("C116", "Garderobe M", "C.1.16"));
rooms.add(new Room("C117", "Technikraum", "C.1.17"));
rooms.add(new Room("C118", "Lagerraum Histologie, Zytologie", "C.1.18"));
rooms.add(new Room("C119", "Biomedizinische Analytik Büro", "C.1.19"));
rooms.add(new Room("C120", "Garderrobe", "C.1.20"));
rooms.add(new Room("C121", "Lehrsaal", "C.1.21"));
rooms.add(new Room("C122a", "Biomedizinische Analytik Büro", "C.1.22a"));
rooms.add(new Room("C122b", "Biomedizinische Analytik Büro", "C.1.22b"));
rooms.add(new Room("C122c", "Biomedizinische Analytik Büro", "C.1.22c"));
rooms.add(new Room("C123", "Funktionsraum", "C.1.23"));
rooms.add(new Room("C128", "Biomedizinische Analytik Büro", "C.1.28"));

// Ebene: D.1
rooms.add(new Room("D102", "Lehrsaal", "D.1.02"));
rooms.add(new Room("D103", "Labor Makroskopie", "D.1.03"));
rooms.add(new Room("D104", "Labor Histologie, Zytologie", "D.1.04"));
rooms.add(new Room("D106", "Labor Klinische Chemie", "D.1.06"));
rooms.add(new Room("D107", null, "D.1.07"));
rooms.add(new Room("D108", "Labor Klinische Chemie", "D.1.08"));
rooms.add(new Room("D109", "Labor Mikrotomie", "D.1.09"));
rooms.add(new Room("D110", "Facilitymanagement", "D.1.10"));
rooms.add(new Room("D111", "Facilitymanagement", "D.1.11"));
rooms.add(new Room("D112", "Technikraum", "D.1.12"));
rooms.add(new Room("D113", null, "D.1.13"));
rooms.add(new Room("D114", "Lagerraum", "D.1.14"));
rooms.add(new Room("D115", "Technikraum", "D.1.15"));
rooms.add(new Room("D116", "Biomedizinische Analytik Büro", "D.1.16"));
rooms.add(new Room("D117", "Biomedizinische Analytik Büro", "D.1.17"));
rooms.add(new Room("D118", "Vorbereitungsraum für Lehrende", "D.1.18"));
rooms.add(new Room("D119", "WC Mitarbeiter*innen", "D.1.19"));
rooms.add(new Room("D121", "Biomedizinische Analytik Büro", "D.1.21"));
rooms.add(new Room("D122", "Biomedizinische Analytik Büro", "D.1.22"));
rooms.add(new Room("D123", "Besprechungsraum", "D.1.23"));
rooms.add(new Room("D124", "Biomedizinische Analytik Büro", "D.1.24"));
rooms.add(new Room("D125", "Küche Mitarbeiter*innen", "D.1.25"));
rooms.add(new Room("D126", "Kopierraum", "D.1.26"));
rooms.add(new Room("D127", "Lagerraum", "D.1.27"));
rooms.add(new Room("D128", "Biomedizinische Analytik Büro", "D.1.28"));
rooms.add(new Room("D129", "Biomedizinische Analytik Büro", "D.1.29"));
rooms.add(new Room("D130", "Vorbereitungsraum für Lehrende", "D.1.30"));
rooms.add(new Room("D131", "Biomedizinische Analytik Büro", "D.1.31"));
rooms.add(new Room("D132", null, "D.1.32"));
rooms.add(new Room("D133", "Administration", "D.1.33"));
rooms.add(new Room("D134", "Biomedizinische Analytik Büro", "D.1.34"));

// Ebene: A.2
rooms.add(new Room("A201", "Besprechungsraum", "A.2.01"));
rooms.add(new Room("A202", "Forschungszentrum Verwaltungswissenschaften", "A.2.02"));
rooms.add(new Room("A203", "Lehrsaal", "A.2.03"));
rooms.add(new Room("A204", "Technikraum", "A.2.04"));
rooms.add(new Room("A205", "Technikraum", "A.2.05")); // Zugang zu A.2.06
rooms.add(new Room("A207", "WC Barrierefrei", "A.2.07"));
rooms.add(new Room("A210", "Lehrsaal", "A.2.10"));
rooms.add(new Room("A211", "Zentrum für wissenschaftliches Schreiben", "A.2.11"));
rooms.add(new Room("A212", "Lagerraum", "A.2.12"));
rooms.add(new Room("A213", "Language Center", "A.2.13"));
rooms.add(new Room("A214", "Forschungszentrum Verwaltungswissenschaften", "A.2.14"));
rooms.add(new Room("A215", "Personalmanagement", "A.2.15"));
rooms.add(new Room("A216", "Forschungszentrum Verwaltungswissenschaften", "A.2.16"));
rooms.add(new Room("A217", "Public Management Büro", "A.2.17"));
rooms.add(new Room("A218", "Public Management Administration", "A.2.18"));
rooms.add(new Room("A219", "Forschungszentrum Verwaltungswissenschaften", "A.2.19"));
rooms.add(new Room("A220", "Public Management Büro", "A.2.20"));
rooms.add(new Room("A221", "Public Management Büro", "A.2.21"));
rooms.add(new Room("A222", "Besprechungsraum", "A.2.22"));
rooms.add(new Room("A223", "Lagerraum", "A.2.23"));
rooms.add(new Room("A224", "Kopierraum", "A.2.24"));
rooms.add(new Room("A225", "Küche Mitarbeiter*innen", "A.2.25"));
rooms.add(new Room("A226", "Sozialwissenschaften Büro", "A.2.26"));
rooms.add(new Room("A227", "Sozialwissenschaften Administration", "A.2.27"));
rooms.add(new Room("A228", "Sozialwissenschaften Büro", "A.2.28"));

//Ebene: B.2
rooms.add(new Room("B201", "Sozialwissenschaften Büro", "B.2.01"));
rooms.add(new Room("B202", "Sozialwissenschaften Administration", "B.2.02")); //Sozialarbiet (Administration), Zugang zu B.2.03
rooms.add(new Room("B204", "Sozialwissenschaften Büro", "B.2.04"));
rooms.add(new Room("B205", null, "B.2.05"));
rooms.add(new Room("B206", "Sozialwissenschaften Büro", "B.2.06"));
rooms.add(new Room("B207", "Sozialwissenschaften Büro", "B.2.07"));
rooms.add(new Room("B208", "Sozialwissenschaften Büro", "B.2.08"));
rooms.add(new Room("B209", "Lehrsaal", "B.2.09"));
rooms.add(new Room("B210", "Küche Mitarberiter*innen", "B.2.10"));
rooms.add(new Room("B211", "Lagerraum", "B.2.11"));
rooms.add(new Room("B212", "Lagerraum", "B.2.12"));
rooms.add(new Room("B213", null, "B.2.13"));
rooms.add(new Room("B214", "Techink", "B.2.14")); //Assistant Researcher, Studentische Mitarbeit
rooms.add(new Room("B215", "IT-Security", "B.2.15"));
rooms.add(new Room("B216", "WC Mitarbeiter*innen", "B.2.16"));
rooms.add(new Room("B218", "Sozialwissenschaften Büro", "B.2.18"));
rooms.add(new Room("B219", "Sozialwissenschaften Büro", "B.2.19"));
rooms.add(new Room("B220", "Sozialwissenschaften Büro", "B.2.20"));
rooms.add(new Room("B221", "Sozialwissenschaften Büro", "B.2.21"));
rooms.add(new Room("B222", "Sozialwissenschaften Büro", "B.2.22"));
rooms.add(new Room("B223", "Sozialwissenschaften Büro", "B.2.23"));
rooms.add(new Room("B224", "Technikraum", "B.2.24")); //Zugang zu B.2.25
rooms.add(new Room("B226", "Technikraum", "B.2.26"));
rooms.add(new Room("B227", "Sozialwissenschaften Büro", "B.2.27"));
rooms.add(new Room("B228", "Sozialwissenschaften Administration", "B.2.28")); //Kinder- und Familienzentrierte Soziale Arbeit, Sozialwirtschaft
rooms.add(new Room("B229", "Küche Mitarbiet*innen", "B.2.29"));
rooms.add(new Room("B230", "Kopierraum", "B.2.30"));
rooms.add(new Room("B232", "Sozialwissenschaften Büro", "B.2.32"));
rooms.add(new Room("B233", null, "B.2.33"));
rooms.add(new Room("B234", "Sozialwissenschaften Büro", "B.2.34"));
rooms.add(new Room("B235", "Sozialwissenschaften Büro", "B.2.35"));
rooms.add(new Room("B236", "Betriebsrat", "B.2.36"));
rooms.add(new Room("B237", "Sozialwissenschaften Administration", "B.2.37")); //Zugang zu B.2.38-39; Department Sozialwissenschaften; Sozialraumorientiert und Klinische Soziale Arbeit; Forschungszentrum Soziale Arbeit

//Ebene: C.2
rooms.add(new Room("C201", "Lehrsaal", "C.2.01"));
rooms.add(new Room("C202", "Lehrsaal", "C.2.02"));
rooms.add(new Room("C203a", null, "C.2.03a"));
rooms.add(new Room("C203b", null, "C.2.03b"));
rooms.add(new Room("C204", "Lehrsaal", "C.2.04"));
rooms.add(new Room("C205", null, "C.2.05"));
rooms.add(new Room("C206", "Lehrsaal", "C.2.06"));
rooms.add(new Room("C207", "WC", "C.2.07")); //Zugang zu C.2.08
rooms.add(new Room("C209", "ÖH Studierendenraum", "C.2.09"));
rooms.add(new Room("C210", "Funktionsraum", "C.2.10"));
rooms.add(new Room("C211", "Technikraum", "C.2.11"));
rooms.add(new Room("C212", "Garderobe Lehrende F", "C.2.12"));
rooms.add(new Room("C213", "Garderobe Lehrende M", "C.2.13"));
rooms.add(new Room("C214", "Garderobe F", "C.2.14"));
rooms.add(new Room("C215", "Technikraum", "C.2.15"));
rooms.add(new Room("C216", null, "C.2.16"));
rooms.add(new Room("C217", null, "C.2.17"));
rooms.add(new Room("C218", "Garderobe M", "C.2.18"));
rooms.add(new Room("C219", "Lagerraum", "C.2.19"));
rooms.add(new Room("C220", "Funktionsraum Notfall und Wundversorgeung", "C.2.20"));
rooms.add(new Room("C221", "Funktionsraum Bewegung und Entspannung", "C.2.21"));
rooms.add(new Room("C222", "Funktionsraum Pflege und klinisches Wochenbett", "C.2.22"));
rooms.add(new Room("C223", "Funktionsraum Schwangerschaft und Neugeborenen-Reanimation", "C.2.23"));
rooms.add(new Room("C228", null, "C.2.28"));

//Ebene: D.2
rooms.add(new Room("D201", "Funktionsraum Geburt", "D.2.01"));
rooms.add(new Room("D202", "Funktionsraum Stillen und außerklinisches Wochenbett", "D.2.02"));
rooms.add(new Room("D203", "Hebammen Büro", "D.2.03"));
rooms.add(new Room("D204", "Hebammen Büro", "D.2.04"));
rooms.add(new Room("D205", "Funktionsraum Hebammenpraxis", "D.2.05"));
rooms.add(new Room("D206", "Hebammen Büro", "D.2.06"));
rooms.add(new Room("D207", "Besprechungsraum", "D.2.07"));
rooms.add(new Room("D208", "Hebammen Büro", "D.2.08"));
rooms.add(new Room("D209", "Besprechungsraum", "D.2.09"));
rooms.add(new Room("D210", "Hebammen Büro", "D.2.10"));
rooms.add(new Room("D211", "Hebammen Büro", "D.2.11"));
rooms.add(new Room("D212", null, "D.2.12"));
rooms.add(new Room("D213", "Hebammen Büro", "D.2.13"));
rooms.add(new Room("D214", "Hebammen Büro", "D.2.14"));
rooms.add(new Room("D215", "Radiotechnologie Lehrmittelraum", "D.2.15"));
rooms.add(new Room("D216", null, "D.2.16")); //auf Foto nicht lesbar?
rooms.add(new Room("D217", "Technikraum", "D.2.17"));
rooms.add(new Room("D218", "Technikraum", "D.2.18"));
rooms.add(new Room("D219", "Radiotechnologie Büro", "D.2.19"));
rooms.add(new Room("D220", "Technikraum", "D.2.20"));
rooms.add(new Room("D221", "Radiotechnologie Büro", "D.2.21"));
rooms.add(new Room("D222", "WC Mitarbeiter*innen", "D.2.22")); //Zugang zu D.2.23
rooms.add(new Room("D224", "Radiotechnologie Büro", "D.2.24"));
rooms.add(new Room("D225", "Radiotechnologie Büro", "D.2.25"));
rooms.add(new Room("D226", "Radiotechnologie", "D.2.26"));
rooms.add(new Room("D227", "Besprechungsraum", "D.2.27"));
rooms.add(new Room("D228", "Küche Mitarbeiter*innen", "D.2.28"));
rooms.add(new Room("D229", "Kopierraum", "D.2.29"));
rooms.add(new Room("D230", "Lagerraum", "D.2.30"));
rooms.add(new Room("D231", "Radiotechnologie Büro", "D.2.31"));
rooms.add(new Room("D232", "Besprechungsraum", "D.2.32"));
rooms.add(new Room("D233", "Radiotechnologie Büro", "D.2.33"));
rooms.add(new Room("D234", "Radiotechnologie Büro", "D.2.34"));
rooms.add(new Room("D235", "Radiotechnologie Büro", "D.2.35"));
rooms.add(new Room("D236", "Radiotechnologie Administration", "D.2.36")); //Zugang zu D.2.37-38

//Ebene: A.3
rooms.add(new Room("A302", "Küche für Mitarbeiter*innen", "A.3.02"));
rooms.add(new Room("A303", "Infrastrukturmanagement Administration", "A.3.03"));
rooms.add(new Room("A304", "Infrastrukturmanagement Büro", "A.3.04"));
rooms.add(new Room("A305", "Technikraum", "A.3.05"));
rooms.add(new Room("A306", "Technikraum", "A.3.06")); //Zugang zu A.3.07
rooms.add(new Room("A308", "Infrastrukturmanagement Büro", "A.3.08"));
rooms.add(new Room("A309", "WC", "A.3.09"));//+ Barrierefrei; Zugang zu A.3.10-11
rooms.add(new Room("A312", null, "A.3.12"));
rooms.add(new Room("A313", "Infrastrukturmanagement Büro", "A.3.13"));
rooms.add(new Room("A314", "Infrastrukturmanagement Büro", "A.3.14"));
rooms.add(new Room("A315", "Besprechungsraum", "A.3.15"));
rooms.add(new Room("A316", null, "A.3.16"));
rooms.add(new Room("A317", "Infrastrukturmanagement Büro", "A.3.17"));
rooms.add(new Room("A318", "-", "A.3.18")); //auf Foto nicht lesbar
rooms.add(new Room("A319", null, "A.3.19"));
rooms.add(new Room("A320", "Infrastrukturmanagement Büro", "A.3.20"));//Campus Card und Anwendungsmanagement
rooms.add(new Room("A321", "Infrastrukturmanagement Büro", "A.3.21"));
rooms.add(new Room("A322", "Sozialwissenschaften Büro", "A.3.22"));
rooms.add(new Room("A323", "Infrastrukturmanagement Büro", "A.3.23"));
rooms.add(new Room("A324", "Infrastrukturmanagement Büro", "A.3.24"));
rooms.add(new Room("A325", "Infrastrukturmanagement Büro", "A.3.25"));
rooms.add(new Room("A326", "Lagerraum", "A.3.26"));
rooms.add(new Room("A327", "Besprechungsraum", "A.3.27"));
rooms.add(new Room("A328", "Clinical Engineering Büro", "A.3.28"));

//Ebene: B.3
rooms.add(new Room("B301", "Technik Büro", "B.3.01"));
rooms.add(new Room("B302", "Technik Büro", "B.3.02"));
rooms.add(new Room("B303", "Clinical Engineering Büro", "B.3.03"));
rooms.add(new Room("B304", "Labor Forschung und Entwicklung", "B.3.04"));
rooms.add(new Room("B305", "Clinical Engineering", "B.3.05"));
rooms.add(new Room("B306", "Technik Studiengangsleiterin", "B.3.06"));
rooms.add(new Room("B307a", "Technik Büro", "B.3.07a"));
rooms.add(new Room("B307b", "Technik Büro", "B.3.07b"));
rooms.add(new Room("B308", "Technik Büro", "B.3.08"));
rooms.add(new Room("B309", "Risiko- und Sicherheitsmanagement Büro", "B.3.09"));
rooms.add(new Room("B310", "Risiko- und Sicherheitsmanagement Büro", "B.3.10"));
rooms.add(new Room("B311", "Risiko- und Sicherheitsmanagement Administration", "B.3.11"));
rooms.add(new Room("B312", "Technik Büro", "B.3.12"));
rooms.add(new Room("B313", "Risiko- und Sicherheitsmanagement Studiengangsleiter", "B.3.13"));
rooms.add(new Room("B314", "Technik Büro", "B.3.14"));
rooms.add(new Room("B315", "Technik Büro", "B.3.15"));
rooms.add(new Room("B316", "WC", "B.3.16"));
rooms.add(new Room("B318", "Technik Büro", "B.3.18"));
rooms.add(new Room("B319", "Technik Studiengangsleiter", "B.3.19"));
rooms.add(new Room("B320", "Technik Administration", "B.3.20")); //Computer Science and Digital Communications; IT-Security; Software Design and Engineering
rooms.add(new Room("B321a", "Technik Administration", "B.3.21a"));//Multilingual Technologies
rooms.add(new Room("B321b", "Technik Büro", "B.3.21b"));
rooms.add(new Room("B322", "Technik Studiengangsleiter", "B.3.22"));
rooms.add(new Room("B323", "Technikraum", "B.3.23")); //Zugang zu B.3.24
rooms.add(new Room("B325", "Angewandte Elektronik und Technische Informatik Administration", "B.3.25"));//Department Technik->Green Mobility, Technische Informarik, Technical Management
rooms.add(new Room("B326", "Technikraum", "B.3.26"));
rooms.add(new Room("B327", "Technik Büro", "B.3.27"));
rooms.add(new Room("B328", "Kopierraum", "B.3.28"));
rooms.add(new Room("B329", "Technik Studiengangsleiter", "B.3.29"));
rooms.add(new Room("B330", "Technik Büro", "B.3.30"));
rooms.add(new Room("B331", "Technik Studiengangsleiter", "B.3.31")); //High Tech Manufacturing; Advanced Manufacturing Tcehnologies and Management
rooms.add(new Room("B332", "Technik Administration", "B.3.32")); //High Tech Manufacturing; Advanced Manufacturing Tcehnologies and Management
rooms.add(new Room("B333", "Küche Mitarbeiter*innen", "B.3.33")); //Zugang zu B.3.33a
rooms.add(new Room("B334", "Technik Büro", "B.3.34")); //Zugang zu B.3.35-36

//Ebene: C.3
rooms.add(new Room("C301", "Funktionsraum", "C.3.01"));
rooms.add(new Room("C302", "Funktionsraum", "C.3.02"));
rooms.add(new Room("C303", "Funktionsraum", "C.3.03"));
rooms.add(new Room("C304", "Funktionsraum", "C.3.04"));
rooms.add(new Room("C305", "WC", "C.3.05")); //Zugang zu C.3.06
rooms.add(new Room("C307", "Technikraum", "C.3.07"));
rooms.add(new Room("C308", "ÖH Studierendenraum", "C.3.08"));
rooms.add(new Room("C309", "Funktionsraum", "C.3.09"));
rooms.add(new Room("C310", "Garderobe Lehrende F", "C.3.10"));
rooms.add(new Room("C311", "Garderobe Lehrende M", "C.3.11"));
rooms.add(new Room("C312", "Garderobe F", "C.3.12"));
rooms.add(new Room("C313", "Technikraum", "C.3.13"));
rooms.add(new Room("C314", "Lagerraum", "C.3.14"));
rooms.add(new Room("C315", "Technikraum", "C.3.15"));
rooms.add(new Room("C316", "Garderobe M", "C.3.16")); 
rooms.add(new Room("C318", "Garderobe", "C.3.18")); //Zugang zu C.3.19-22, C.3.17?
rooms.add(new Room("C323", "Lagerraum", "C.3.23"));
rooms.add(new Room("C324", "Lehrküche", "C.3.24")); //Zugang zu C.3.25-30
rooms.add(new Room("C332", "Lagerraum", "C.3.32"));
rooms.add(new Room("C333", "Funktionsraum", "C.3.33"));
rooms.add(new Room("C334", "Funktionsraum", "C.3.34"));
rooms.add(new Room("C335", "Funktionsraum", "C.3.35"));
rooms.add(new Room("C336", "Spreiseraum", "C.3.36"));

//Ebene: D.3
rooms.add(new Room("D301a", "Lagerraum", "D.3.01a"));
rooms.add(new Room("D301b", "Funktionsraum", "D.3.01b"));
rooms.add(new Room("D302", "Funktionsraum", "D.3.02"));
rooms.add(new Room("D303", "Funktionsraum", "D.3.03"));
rooms.add(new Room("D304", "Funktionsraum", "D.3.04"));
rooms.add(new Room("D305", "Funktionsraum", "D.3.05"));
rooms.add(new Room("D306", "Funktionsraum", "D.3.06"));
rooms.add(new Room("D307", "Diätologie Studiengangsleiterin", "D.3.07"));
rooms.add(new Room("D308", "Diätologie Administration", "D.3.08")); //Gesundheitswissenschaften
rooms.add(new Room("D309", "Funktionsraum", "D.3.09"));
rooms.add(new Room("D310", "Diätologie Administration", "D.3.10"));
rooms.add(new Room("D311", "Vorbereitungsraum für Lehrende", "D.3.11"));
rooms.add(new Room("D312", "Diätologie Büro", "D.3.12"));
rooms.add(new Room("D313", "Technikraum", "D.3.13"));
rooms.add(new Room("D314", "Diätologie Büro", "D.3.14"));
rooms.add(new Room("D315", "Technikraum", "D.3.15"));
rooms.add(new Room("D316", "Diätologie Büro", "D.3.16"));
rooms.add(new Room("D317", "Technikraum", "D.3.17"));
rooms.add(new Room("D318", "Lagerraum", "D.3.18"));
rooms.add(new Room("D319", "Diätologie Büro", "D.3.19"));
rooms.add(new Room("D320", "WC Mitarbeiter*innen", "D.3.20"));
rooms.add(new Room("D322", null, "D.3.22"));
rooms.add(new Room("D323", "Besprechungsraum", "D.3.23"));
rooms.add(new Room("D324", "Küche Mitarbeiter*innen", "D.3.24"));
rooms.add(new Room("D325", "Kopierraum", "D.3.25"));
rooms.add(new Room("D326", "Lagerraum", "D.3.26"));
rooms.add(new Room("D327", null, "D.3.27"));
rooms.add(new Room("D328", "Radiotechnologie Büro", "D.3.28")); //Sonography Studienprogrammleiterin
rooms.add(new Room("D329", "Radiotechnologie Büro", "D.3.29"));
rooms.add(new Room("D330", "Vorbereitunsraum für Lehrende", "D.3.30"));
rooms.add(new Room("D331", "Radiotechnologie Büro", "D.3.31"));
rooms.add(new Room("D332", "Besprechungsraum", "D.3.32"));
rooms.add(new Room("D333", "Orthoptik", "D.3.33"));
rooms.add(new Room("D334", "Radiotechnologie Büro", "D.3.34"));
rooms.add(new Room("D335", "Orthoptik Administration", "D.3.35")); //Zugang zu D.3.36-37

//Ebene: A.-1
rooms.add(new Room("A-101", "Lehrsaal", "A.-1.01"));
rooms.add(new Room("A-102", "Lehrsaal", "A.-1.02"));
rooms.add(new Room("A-103", "Lehrsaal", "A.-1.03"));
rooms.add(new Room("A-104", "Lehrsaal", "A.-1.04"));
rooms.add(new Room("A-105", "Lehrsaal", "A.-1.05"));
rooms.add(new Room("A-106", null, "A.-1.06")); //Zugang zu A.-1.08-21
rooms.add(new Room("A-123", null, "A.-1.23")); //Zugang zu A.-1.16, A.-1.22
rooms.add(new Room("A-124", null, "A.-1.24")); //Zugang zu A.-1.25
rooms.add(new Room("A-126", "Lagerraum", "A.-1.26")); //Zugang zu A.-1.27-28

//Ebene: B.-1
rooms.add(new Room("B-101", "Küche", "B.-1.01"));
rooms.add(new Room("B-111", "Cafeteria", "B.-1.11")); //Zugang zu B.-1.02-10, B.-1.12-13
rooms.add(new Room("B-112", "Garderobe F", "B.-1.12"));
rooms.add(new Room("B-113", "Garderobe M", "B.-1.13"));
rooms.add(new Room("B-114", null, "B.-1.14")); //Zugang zu B.-1.15-21
rooms.add(new Room("B-122", "WC", "B.-1.22"));
rooms.add(new Room("B-123", "WC", "B.-1.23")); //Zugang zu B.-1.23
rooms.add(new Room("B-125", null, "B.-1.25")); //Zugang zu B.-1.26-30

//Ebene: A.-2
rooms.add(new Room("A-205", "Lagerraum", "A.-2.05"));

//Ebene: B.-2
rooms.add(new Room("B-207", "Zugang Parkgarage", "B.-2.07")); //Zugang zu B.-2.03, B.-2.06
rooms.add(new Room("B-208", "WC F", "B.-2.08"));
rooms.add(new Room("B-209", "WC M", "B.-2.09")); //Einzeldusche und Umkleide für alle; Zugang zu?

//Ebene: C.-2
rooms.add(new Room("C-201", "CT-Labor", "C.-2.01"));
rooms.add(new Room("C-203", "Intensivzimmer", "C.-2.03"));
rooms.add(new Room("C-204", "Strahlenlabor", "C.-2.04"));
rooms.add(new Room("C-205", "OPIC Stationsstützpunkt", "C.-2.05")); //Zugang zu C.-2.06
rooms.add(new Room("C-207", "OP-Saal", "C.-2.07"));
rooms.add(new Room("C-208", "Funktionsraum", "C.-2.08"));
rooms.add(new Room("C-209", null, "C.-2.09")); //Zugang zu C.-2.12
rooms.add(new Room("C-210", "Technikraum", "C.-2.10"));
rooms.add(new Room("C-211", "Technikraum", "C.-2.11"));
rooms.add(new Room("C-213", null, "C.-2.13"));
rooms.add(new Room("C-214", "WC", "C.-2.14"));
rooms.add(new Room("C-215", "Garderobe M", "C.-2.15"));
rooms.add(new Room("C-216", "Turnsaal", "C.-2.16")); //Zugang zu C.-2.23
rooms.add(new Room("C-217", "Garderobe Lehrende M", "C.-2.17"));
rooms.add(new Room("C-218", "Garderobe Lehrende F", "C.-2.18"));
rooms.add(new Room("C-219", "Garderobe F", "C.-2.19")); //+ Dusche F
rooms.add(new Room("C-224", "Funktionsraum", "C.-2.24"));
rooms.add(new Room("C-225", "Funktionsraum", "C.-2.25"));
rooms.add(new Room("C-226", "Kardioraum", "C.-2.26"));
rooms.add(new Room("C-227", "Arbeitsplatzsimulation", "C.-2.27"));
rooms.add(new Room("C-228", "Technikraum", "C.-2.28"));
rooms.add(new Room("C-229", "Lagerraum", "C.-2.29"));
rooms.add(new Room("C-230", "Kraftraum", "C.-2.30"));
rooms.add(new Room("C-231", "Lagerraum", "C.-2.31"));

//Ebene: D.-2
rooms.add(new Room("D-201", "Labor", "D.-2.01")); //Zugang zu D.-2.02-19
}

public List<Room> getRooms(){
    return rooms;
}


}