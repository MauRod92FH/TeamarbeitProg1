package model;

import java.util.ArrayList;
import java.util.List;

public class CampusLocation {

    /* Gemeinsame Grundlage für alle auffindbaren oder als Ziel auswählbaren Orte: Räume, Lernflächen, Eingänge
    Name, Ebene, Gebäudebereich und Kategorie jedes Ortes
     */
    private List<Room> rooms = new ArrayList<>();

    public CampusLocation() {
        // Ebene: A.E
        rooms.add(new Room("AE01", "ÖH", "A.E.01"));
        rooms.add(new Room("AE02", "Bibliothek", "A.E.02"));
        rooms.add(new Room("AE03", "Bibliothek", "A.E.03")); // noch ein Zugang mit A.E.03, Bib hat drei Eingänge
        rooms.add(new Room("AE04", "Technikraum", "A.E.04"));
        rooms.add(new Room("AE09", "Technikraum", "A.E.09"));
        rooms.add(new Room("AE10", "-", "A.E.10"));
        rooms.add(new Room("AE11", "-", "A.E.11"));
        rooms.add(new Room("AE12", "-", "A.E.12"));

        // Ebene: B.E
        rooms.add(new Room("BE01", "Festsaal", "B.E.01"));
        rooms.add(new Room("BE02", "Festsaal", "B.E.02"));
        rooms.add(new Room("BE03", "Festsaal", "B.E.03"));
        rooms.add(new Room("BE04", "-", "B.E.04"));
        rooms.add(new Room("BE05", "WC Barrierefrei", "B.E.05"));
        rooms.add(new Room("BE06", "WC", "B.E.06"));
        rooms.add(new Room("BE07", "-", "B.E.07"));
        rooms.add(new Room("BE08", "-", "B.E.08"));
        rooms.add(new Room("BE09", "-", "B.E.09"));
        rooms.add(new Room("BE10", "-", "B.E.10"));
        rooms.add(new Room("BE11", "-", "B.E.11"));
        rooms.add(new Room("BE12", "-", "B.E.12"));
        rooms.add(new Room("BE14", "Müllraum", "B.E.14"));
        rooms.add(new Room("BE15", "-", "B.E.15"));

        // Ebene: C.E
        rooms.add(new Room("CE01", "-", "C.E.01"));
        rooms.add(new Room("CE02", "-", "C.E.02"));
        rooms.add(new Room("CE03", "-", "C.E.03"));
        rooms.add(new Room("CE04", "-", "C.E.04"));
        rooms.add(new Room("CE05", "-", "C.E.05"));
        rooms.add(new Room("CE06", "Raum der Stille", "C.E.06"));
        rooms.add(new Room("CE07", "Wickelraum", "C.E.07"));
        rooms.add(new Room("CE08", "Stillraum", "C.E.08"));
        rooms.add(new Room("CE09", "-", "C.E.09"));
        rooms.add(new Room("CE10", "-", "C.E.10"));
        rooms.add(new Room("CE11", "-", "C.E.11"));
        rooms.add(new Room("CE12", "Dusche F", "C.E.12"));
        rooms.add(new Room("CE13", "3D-Lab", "C.E.13"));
        rooms.add(new Room("CE14", "VR-Lab", "C.E.14"));
        rooms.add(new Room("CE15", "2D-Lab", "C.E.15"));
        rooms.add(new Room("CE16", "Analyse", "C.E.16"));
        rooms.add(new Room("CE17", "Performance Lab", "C.E.17"));
        rooms.add(new Room("CE18", "Medizinische Trainingstherapie", "C.E.18"));

        // Ebene: D.E
        rooms.add(new Room("DE01", "Labor L2", "D.E.01")); // D.E.01 - 21

        // Ebene: C.Z
        rooms.add(new Room("CZ01", "-", "C.Z.01"));
        rooms.add(new Room("CZ02", "-", "C.Z.02"));
        rooms.add(new Room("CZ03", "-", "C.Z.03"));
        rooms.add(new Room("CZ04", "-", "C.Z.04"));
        rooms.add(new Room("CZ05", "-", "C.Z.05"));
        rooms.add(new Room("CZ06", "-", "C.Z.06"));
        rooms.add(new Room("CZ08a", "-", "C.Z.08a"));
        rooms.add(new Room("CZ08b", "-", "C.Z.08b"));
        rooms.add(new Room("CZ09", "-", "C.Z.09"));
        rooms.add(new Room("CZ10", "-", "C.Z.10"));
        rooms.add(new Room("CZ11", "-", "C.Z.11"));
        rooms.add(new Room("CZ12", "-", "C.Z.12"));
        rooms.add(new Room("CZ13", "-", "C.Z.13"));
        rooms.add(new Room("CZ14", "-", "C.Z.14"));
        rooms.add(new Room("CZ15", "-", "C.Z.15"));
        rooms.add(new Room("CZ16", "-", "C.Z.16"));
        rooms.add(new Room("CZ17", "-", "C.Z.17"));
        rooms.add(new Room("CZ18", "-", "C.Z.18"));
        rooms.add(new Room("CZ19", "-", "C.Z.19"));
        rooms.add(new Room("CZ20", "-", "C.Z.20"));
        rooms.add(new Room("CZ21", "-", "C.Z.21"));
        rooms.add(new Room("CZ22", "-", "C.Z.22"));
        rooms.add(new Room("CZ23", "-", "C.Z.23"));

        // Ebene: D.Z
        rooms.add(new Room("DZ01", "-", "D.Z.01"));
        rooms.add(new Room("DZ02", "-", "D.Z.02"));
        rooms.add(new Room("DZ03", "-", "D.Z.03"));
        rooms.add(new Room("DZ04", "-", "D.Z.04"));
        rooms.add(new Room("DZ05", "Labor Immunhämatologie", "D.Z.05"));
        rooms.add(new Room("DZ06", "Labor Hämatologie, Immunhämatologie", "D.Z.06"));
        rooms.add(new Room("DZ07", "Labor Hämatologie, Immunhämatologie", "D.Z.07"));
        rooms.add(new Room("DZ08", "-", "D.Z.08"));
        rooms.add(new Room("DZ09", "-", "D.Z.09"));
        rooms.add(new Room("DZ10", "-", "D.Z.10"));
        rooms.add(new Room("DZ11", "-", "D.Z.11"));
        rooms.add(new Room("DZ12", "-", "D.Z.12"));
        rooms.add(new Room("DZ13", "-", "D.Z.13"));
        rooms.add(new Room("DZ14", "Labor Zytologie", "D.Z.14"));
        rooms.add(new Room("DZ16", "Labor Zytologie", "D.Z.16"));
        rooms.add(new Room("DZ17", "WC Mitarbeiter*innen", "D.Z.17"));
        rooms.add(new Room("DZ19", "-", "D.Z.19"));
        rooms.add(new Room("DZ20", "-", "D.Z.20"));
        rooms.add(new Room("DZ21", "Biomedizinische Analytik Büro", "D.Z.21"));
        rooms.add(new Room("DZ22", "Biomedizinische Analytik Büro", "D.Z.22"));
        rooms.add(new Room("DZ23", "Biomedizinische Analytik Büro", "D.Z.23"));
        rooms.add(new Room("DZ24", "Biomedizinische Analytik Büro", "D.Z.24"));
        rooms.add(new Room("DZ25", "Biomedizinische Analytik Büro", "D.Z.25"));
        rooms.add(new Room("DZ26", "Besprechungsraum", "D.Z.26"));
        rooms.add(new Room("DZ27", "Küche Mitarbeiter*innen", "D.Z.27"));
        rooms.add(new Room("DZ28", "Kopierraum", "D.Z.28"));
        rooms.add(new Room("DZ30", "Administration", "D.Z.30")); // Funktionsdiagnostik, Histopathologie, Zytologie; Zugang zu D.Z.32 - 33
        rooms.add(new Room("DZ31", "-", "D.Z.31"));

        // Ebene: A.1
        rooms.add(new Room("A101", "Lehrsaal", "A.1.01"));
        rooms.add(new Room("A102a", "-", "A.1.02a"));
        rooms.add(new Room("A103", "Lehrsaal", "A.1.03"));
        rooms.add(new Room("A104", "Technikraum", "A.1.04"));
        rooms.add(new Room("A105", "Lehrsaal", "A.1.05"));
        rooms.add(new Room("A106", "Technikraum", "A.1.06"));
        rooms.add(new Room("A107", "Lagerraum", "A.1.07"));
        rooms.add(new Room("A108", "WC", "A.1.08"));
        rooms.add(new Room("A109", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.09"));
        rooms.add(new Room("A110", "WC für Mitarbeiter*innen", "A.1.10"));
        rooms.add(new Room("A111", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.11"));
        rooms.add(new Room("A112", "Tax Management", "A.1.12"));
        rooms.add(new Room("A113", "Lehrsaal", "A.1.13"));
        rooms.add(new Room("A114", "Tax Management", "A.1.14"));
        rooms.add(new Room("A115", "PHOENIX CONTACT Labor", "A.1.15"));
        rooms.add(new Room("A116", "Lehrsaal", "A.1.16"));
        rooms.add(new Room("A117", "-", "A.1.17"));
        rooms.add(new Room("A118", "-", "A.1.18"));

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
        rooms.add(new Room("B112", "-", "B.1.12"));
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
        rooms.add(new Room("B125", "-", "B.1.25"));
        rooms.add(new Room("B126", "IT-Services", "B.1.26")); // Zugang zu B.1.27-30

        // Ebene: C.1
        rooms.add(new Room("C101", "Selbsthilferaum", "C.1.01"));
        rooms.add(new Room("C102", "Mikroskopiersaal", "C.1.02"));
        rooms.add(new Room("C103", "Selbsthilferaum", "C.1.03"));
        rooms.add(new Room("C104", "Mikroskopiersaal", "C.1.04"));
        rooms.add(new Room("C105", "Lagerraum", "C.1.05"));
        rooms.add(new Room("C106", "WC", "C.1.06")); // Zugang zu C.1.07
        rooms.add(new Room("C108a", "Lagerraum", "C.1.08a"));
        rooms.add(new Room("C108b", "-", "C.1.08b"));
        rooms.add(new Room("C109", "Funktionsdiagnostik", "C.1.09"));
        rooms.add(new Room("C110", "Garderobe Lehrende F", "C.1.10"));
        rooms.add(new Room("C111", "Technikraum", "C.1.11"));
        rooms.add(new Room("C112", "Garderobe Lehrrende F", "C.1.12"));
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
        rooms.add(new Room("D107", "-", "D.1.07"));
        rooms.add(new Room("D108", "Labor Klinische Chemie", "D.1.08"));
        rooms.add(new Room("D109", "Labor Mikrotomie", "D.1.09"));
        rooms.add(new Room("D110", "Facilitymanagement", "D.1.10"));
        rooms.add(new Room("D111", "Facilitymanagement", "D.1.11"));
        rooms.add(new Room("D112", "Technikraum", "D.1.12"));
        rooms.add(new Room("D113", "-", "D.1.13"));
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
        rooms.add(new Room("D130", "Vorbereitungsraum für Lehrende", "D.1.302"));
        rooms.add(new Room("D131", "Biomedizinische Analytik Büro", "D.1.31"));
        rooms.add(new Room("D132", "-", "D.1.32"));
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

        // Ebene: B.2
        rooms.add(new Room("B201", "Sozialwissenschaften Büro", "B.2.01"));
        rooms.add(new Room("B202", "Sozialwissenschaften Administration", "B.2.02"));
        rooms.add(new Room("B204", "Sozialwissenschaften Büro", "B.2.04"));
        rooms.add(new Room("B205", "-", "B.2.05"));
        rooms.add(new Room("B206", "Sozialwissenschaften Büro", "B.2.06"));
        rooms.add(new Room("B207", "Sozialwissenschaften Büro", "B.2.07"));
        rooms.add(new Room("B208", "Sozialwissenschaften Büro", "B.2.08"));
        rooms.add(new Room("B209", "Lehrsaal", "B.2.09"));
        rooms.add(new Room("B210", "Küche Mitarberiter*innen", "B.2.10"));
        rooms.add(new Room("B211", "Lagerraum", "B.2.11"));
        rooms.add(new Room("B212", "Lagerraum", "B.2.12"));
        rooms.add(new Room("B213", "-", "B.2.13"));
        rooms.add(new Room("B214", "Techink", "B.2.14"));
        rooms.add(new Room("B215", "IT-Security", "B.2.15"));
        rooms.add(new Room("B216", "WC Mitarbeiter*innen", "B.2.16"));
        rooms.add(new Room("B218", "Sozialwissenschaften Büro", "B.2.18"));
        rooms.add(new Room("B219", "Sozialwissenschaften Büro", "B.2.19"));
        rooms.add(new Room("B220", "Sozialwissenschaften Büro", "B.2.20"));
        rooms.add(new Room("B221", "Sozialwissenschaften Büro", "B.2.21"));
        rooms.add(new Room("B222", "Sozialwissenschaften Büro", "B.2.22"));
        rooms.add(new Room("B223", "Sozialwissenschaften Büro", "B.2.23"));
        rooms.add(new Room("B224", "Technikraum", "B.2.24"));
        rooms.add(new Room("B226", "Technikraum", "B.2.26"));
        rooms.add(new Room("B227", "Sozialwissenschaften Büro", "B.2.27"));
        rooms.add(new Room("B228", "Sozialwissenschaften Administration", "B.2.28"));
        rooms.add(new Room("B229", "Küche Mitarbiet*innen", "B.2.29"));
        rooms.add(new Room("B230", "Kopierraum", "B.2.30"));
        rooms.add(new Room("B232", "Sozialwissenschaften Büro", "B.2.32"));
        rooms.add(new Room("B233", "-", "B.2.33"));
        rooms.add(new Room("B234", "Sozialwissenschaften Büro", "B.2.34"));
        rooms.add(new Room("B235", "Sozialwissenschaften Büro", "B.2.35"));
        rooms.add(new Room("B236", "Betriebsrat", "B.2.36"));
        rooms.add(new Room("B237", "Sozialwissenschaften Administration", "B.2.37"));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}