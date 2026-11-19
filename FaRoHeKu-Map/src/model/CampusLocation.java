package model;

public class CampusLocation {
/* Gemeinsame Grundlage für alle auffindbaren oder als Ziel auswählbaren Orte: Räume, Lernflächen, Eingänge
Name, Ebene, Gebäudebereich und Kategorie jedes Ortes

 */

//Ebene: A.E
Room room1 = new Room ("AE01", "ÖH", "A.E.01" );
Room room2 = new Room ("AE02", "Bibliothek", "A.E.02");
Room room3 = new Room ("AE03", "Bibliothek", "A.E.03"); //noch ein Zugang mit A.E.03, Bib hat drei Eingänge
Room room4 = new Room ("AE04", "Technikraum", "A.E.04");
Room room5 = new Room ("AE09", "Technikraum", "A.E.09");
Room room6 = new Room ("AE10", "-", "A.E.10");
Room room7 = new Room ("AE11", "-", "A.E.11");
Room room8 = new Room ("AE12", "-", "A.E.12");

//Ebene: B.E
Room room9 = new Room ("BE01", "Festsaal", "B.E.01");
Room room10 = new Room ("BE02", "Festsaal", "B.E.02");
Room room11 = new Room ("BE03", "Festsaal", "B.E.03");
Room room12 = new Room ("BE04", "-", "B.E.04");
Room room13 = new Room ("BE05", "WC Barrierefrei", "B.E.05");
Room room14 = new Room ("BE06", "WC", "B.E.06");
Room room15 = new Room ("BE07", "-", "B.E.07");
Room room16 = new Room ("BE08", "-", "B.E.08");
Room room17 = new Room ("BE09", "-", "B.E.09");
Room room18 = new Room ("BE10", "-", "B.E.10");
Room room19 = new Room ("BE11", "-", "B.E.11");
Room room20 = new Room ("BE12", "-", "B.E.12");
Room room21 = new Room ("BE14", "Müllraum", "B.E.14");
Room room22 = new Room ("BE15", "-", "B.E.15");

//Ebene: C.E
Room room23 = new Room ("CE01", "-", "C.E.01");
Room room24 = new Room ("CE02", "-", "C.E.02");
Room room25 = new Room ("CE03", "-", "C.E.03");
Room room26 = new Room ("CE04", "-", "C.E.04");
Room room27 = new Room ("CE05", "-", "C.E.05");
Room room28 = new Room ("CE06", "Raum der Stille", "C.E.06");
Room room29 = new Room ("CE07", "Wickelraum", "C.E.07");
Room room30 = new Room ("CE08", "Stillraum", "C.E.08");
Room room31 = new Room ("CE09", "-", "C.E.09");
Room room32 = new Room ("CE10", "-", "C.E.10");
Room room33 = new Room ("CE11", "-", "C.E.11");
Room room34 = new Room ("CE12", "Dusche F", "C.E.12");
Room room35 = new Room ("CE13", "3D-Lab", "C.E.13");
Room room36 = new Room ("CE14", "VR-Lab", "C.E.14");
Room room37 = new Room ("CE15", "2D-Lab", "C.E.15");
Room room38 = new Room ("CE16", "Analyse", "C.E.16");
Room room39 = new Room ("CE17", "Performance Lab", "C.E.17");
Room room40 = new Room ("CE18", "Medizinische Trainingstherapie", "C.E.18");

//Ebene: D.E
Room room41 = new Room ("DE01", "Labor L2", "D.E.01"); // D.E.01 - 21

//Ebene: C.Z
Room room42 = new Room ("CZ01", "-", "C.Z.01");
Room room43 = new Room ("CZ02", "-", "C.Z.02");
Room room44 = new Room ("CZ03", "-", "C.Z.03");
Room room45 = new Room ("CZ04", "-", "C.Z.04");
Room room46 = new Room ("CZ05", "-", "C.Z.05");
Room room47 = new Room ("CZ06", "-", "C.Z.06");
Room room48 = new Room ("CZ08a", "-", "C.Z.08a");
Room room49 = new Room ("CZ08b", "-", "C.Z.08b");
Room room50 = new Room ("CZ09", "-", "C.Z.09");
Room room51 = new Room ("CZ10", "-", "C.Z.10");
Room room52 = new Room ("CZ11", "-", "C.Z.11");
Room room53 = new Room ("CZ12", "-", "C.Z.12");
Room room54 = new Room ("CZ13", "-", "C.Z.13");
Room room55 = new Room ("CZ14", "-", "C.Z.14");
Room room56 = new Room ("CZ15", "-", "C.Z.15");
Room room57 = new Room ("CZ16", "-", "C.Z.16");
Room room58 = new Room ("CZ17", "-", "C.Z.17");
Room room59 = new Room ("CZ18", "-", "C.Z.18");
Room room60 = new Room ("CZ19", "-", "C.Z.19");
Room room61 = new Room ("CZ20", "-", "C.Z.20");
Room room62 = new Room ("CZ21", "-", "C.Z.21");
Room room63 = new Room ("CZ22", "-", "C.Z.22");
Room room64 = new Room ("CZ23", "-", "C.Z.23");

//Ebene: D.Z
Room room65 = new Room ("DZ01", "-", "D.Z.01");
Room room66 = new Room ("DZ02", "-", "D.Z.02");
Room room67 = new Room ("DZ03", "-", "D.Z.03");
Room room68 = new Room ("DZ04", "-", "D.Z.04");
Room room69 = new Room ("DZ05", "Labor Immunhämatologie", "D.Z.05");
Room room70 = new Room ("DZ06", "Labor Hämatologie, Immunhämatologie", "D.Z.06");
Room room71 = new Room ("DZ07", "Labor Hämatologie, Immunhämatologie", "D.Z.07");
Room room72 = new Room ("DZ08", "-", "D.Z.08");
Room room73 = new Room ("DZ09", "-", "D.Z.09");
Room room74 = new Room ("DZ10", "-", "D.Z.10");
Room room75 = new Room ("DZ11", "-", "D.Z.11");
Room room76 = new Room ("DZ12", "-", "D.Z.12");
Room room77 = new Room ("DZ13", "-", "D.Z.13");
Room room78 = new Room ("DZ14", "Labor Zytologie", "D.Z.14");
Room room79 = new Room ("DZ16", "Labor Zytologie", "D.Z.16");
Room room80 = new Room ("DZ17", "WC Mitarbeiter*innen", "D.Z.17");
Room room81 = new Room ("DZ19", "-", "D.Z.19");
Room room82 = new Room ("DZ20", "-", "D.Z.20");
Room room83 = new Room ("DZ21", "Biomedizinische Analytik Büro", "D.Z.21");
Room room84 = new Room ("DZ22", "Biomedizinische Analytik Büro", "D.Z.22");
Room room85 = new Room ("DZ23", "Biomedizinische Analytik Büro", "D.Z.23");
Room room86 = new Room ("DZ24", "Biomedizinische Analytik Büro", "D.Z.24");
Room room87 = new Room ("DZ25", "Biomedizinische Analytik Büro", "D.Z.25");
Room room88 = new Room ("DZ26", "Besprechungsraum", "D.Z.26");
Room room89 = new Room ("DZ27", "Küche Mitarbeiter*innen", "D.Z.27");
Room room90 = new Room ("DZ28", "Kopierraum", "D.Z.28");
Room room91 = new Room ("DZ30", "Administration", "D.Z.30"); //Funktionsdiagnostik, Histopathologie, Zytologie; Zugang zu D.Z.32 - 33
Room room92 = new Room ("DZ31", "-", "D.Z.31");

//Ebene: A.1
Room room93 = new Room ("A101", "Lehrsaal", "A.1.01");
Room room94 = new Room ("A102a", "-", "A.1.02a");
Room room95 = new Room ("A103", "Lehrsaal", "A.1.03");
Room room96 = new Room ("A104", "Technikraum", "A.1.04");
Room room97 = new Room ("A105", "Lehrsaal", "A.1.05");
Room room98 = new Room ("A106", "Technikraum", "A.1.06");
Room room99 = new Room ("A107", "Lagerraum", "A.1.07");
Room room100 = new Room ("A108", "WC", "A.1.08");
Room room101 = new Room ("A109", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.09");
Room room102 = new Room ("A110", "WC für Mitarbeiter*innen", "A.1.10");
Room room103 = new Room ("A111", "Verwaltung, Wirtschaft, Sicherheit, Politik Büro", "A.1.11");
Room room104 = new Room ("A112", "Tax Management", "A.1.12");
Room room105 = new Room ("A113", "Lehrsaal", "A.1.13");
Room room106 = new Room ("A114", "Tax Management", "A.1.14");
Room room107 = new Room ("A115", "PHOENIX CONTACT Labor", "A.1.15");
Room room108 = new Room ("A116", "Lehrsaal", "A.1.16");
Room room109 = new Room ("A117", "-", "A.1.17");
Room room110 = new Room ("A118", "-", "A.1.18");

//Ebene: B.1 
Room room111 = new Room ("B101", "Lehrsaal", "B.1.01");
Room room112 = new Room ("B102", "Lehrsaal", "B.1.02");
Room room113 = new Room ("B103", "Lehrsaal", "B.1.03");
Room room114 = new Room ("B104", "Tax Management", "B.1.04");
Room room115 = new Room ("B105", "Lehrsaal", "B.1.05");
Room room116 = new Room ("B106", "EDV-Lehrsaal", "B.1.06");
Room room117 = new Room ("B107", "EDV-Lehrsaal", "B.1.07");
Room room118 = new Room ("B108", "EDV-Lehrsaal", "B.1.08");
Room room119 = new Room ("B109", "IT-Services", "B.1.09");
Room room120 = new Room ("B110", "EDV-Lehrsaal", "B.1.10");
Room room121 = new Room ("B111", "Elektroniklabor", "B.1.11"); //Zugang zu B.1.12
Room room122 = new Room ("B112", "-", "B.1.12");
Room room123 = new Room ("B113", "WC", "B.1.13");
Room room124 = new Room ("B114", "WC", "B.1.14");
Room room125 = new Room ("B115", "IT-Services", "B.1.15");
Room room126 = new Room ("B116", "IT-Services", "B.1.16");
Room room127 = new Room ("B117", "Technikraum", "B.1.17"); //Zugang zu B.1.20
Room room128 = new Room ("B118", "IT-Services", "B.1.18");
Room room129 = new Room ("B121", "Technikraum", "B.1.21");
Room room130 = new Room ("B122", "Küche Mitarbeiter*innen", "B.1.22");
Room room131 = new Room ("B123", "IT-Services", "B.1.23");
Room room132 = new Room ("B124", "Netzwerklabor", "B.1.24"); //Zugang zu B.1.25
Room room133 = new Room ("B125", "-", "B.1.25");
Room room134 = new Room ("B126", "IT-Services", "B.1.26"); //ZUgang zu B.1.27-30

//Ebene: C.1
Room room135 = new Room ("C101", "Selbsthilferaum", "C.1.01");
Room room136 = new Room ("C102", "Mikroskopiersaal", "C.1.02");
Room room137 = new Room ("C103", "Selbsthilferaum", "C.1.03");
Room room138 = new Room ("C104", "Mikroskopiersaal", "C.1.04");
Room room139 = new Room ("C105", "Lagerraum", "C.1.05");
Room room140 = new Room ("C106", "WC", "C.1.06"); //Zugang zu C.1.07
Room room141 = new Room ("C108a", "Lagerraum", "C.1.08a");
Room room142 = new Room ("C108b", "-", "C.1.08b");
Room room143 = new Room ("C109", "Funktionsdiagnostik", "C.1.09");
Room room144 = new Room ("C110", "Garderobe Lehrende F", "C.1.10");
Room room145 = new Room ("C111", "Technikraum", "C.1.11");
Room room146 = new Room ("C112", "Garderobe Lehrrende F", "C.1.12");
Room room147 = new Room ("C113", "Garderrobe F", "C.1.13");
Room room148 = new Room ("C114", "Technikraum", "C.1.14");
Room room149 = new Room ("C115", "Lagerraum", "C.1.15");
Room room150 = new Room ("C116", "Garderobe M", "C.1.16");
Room room151 = new Room ("C117", "Technikraum", "C.1.17");
Room room152 = new Room ("C118", "Lagerraum Histologie, Zytologie", "C.1.18");
Room room153 = new Room ("C119", "Biomedizinische Analytik Büro", "C.1.19"); 
Room room154 = new Room ("C120", "Garderrobe", "C.1.20");
Room room155 = new Room ("C121", "Lehrsaal", "C.1.21");
Room room156 = new Room ("C122a", "Biomedizinische Analytik Büro", "C.1.22a");
Room room157 = new Room ("C122b", "Biomedizinische Analytik Büro", "C.1.22b");
Room room158 = new Room ("C122c", "Biomedizinische Analytik Büro", "C.1.22c");
Room room159 = new Room ("C123", "Funktionsraum", "C.1.23");
Room room160 = new Room ("C128", "Biomedizinische Analytik Büro", "C.1.28");

//Ebene: D.1
Room room161 = new Room ("D102", "Lehrsaal", "D.1.02");
Room room162 = new Room ("D103", "Labor Makroskopie", "D.1.03");
Room room163 = new Room ("D104", "Labor Histologie, Zytologie", "D.1.04");
Room room164 = new Room ("D106", "Labor Klinische Chemie", "D.1.06");
Room room165 = new Room ("D107", "-", "D.1.07");
Room room166 = new Room ("D108", "Labor Klinische Chemie", "D.1.08");
Room room167 = new Room ("D109", "Labor Mikrotomie", "D.1.09");
Room room168 = new Room ("D110", "Facilitymanagement", "D.1.10");
Room room169 = new Room ("D111", "Facilitymanagement", "D.1.11");
Room room170 = new Room ("D112", "Technikraum", "D.1.12");
Room room171 = new Room ("D113", "-", "D.1.13");
Room room172 = new Room ("D114", "Lagerraum", "D.1.14");
Room room173 = new Room ("D115", "Technikraum", "D.1.15");
Room room174 = new Room ("D116", "Biomedizinische Analytik Büro", "D.1.16");
Room room175 = new Room ("D117", "Biomedizinische Analytik Büro", "D.1.17");
Room room176 = new Room ("D118", "Vorbereitungsraum für Lehrende", "D.1.18");
Room room177 = new Room ("D119", "WC Mitarbeiter*innen", "D.1.19");
Room room178 = new Room ("D121", "Biomedizinische Analytik Büro", "D.1.21");
Room room179 = new Room ("D122", "Biomedizinische Analytik Büro", "D.1.22");
Room room180 = new Room ("D123", "Besprechungsraum", "D.1.23");
Room room181 = new Room ("D124", "Biomedizinische Analytik Büro", "D.1.24");
Room room182 = new Room ("D125", "Küche Mitarbeiter*innen", "D.1.25");
Room room183 = new Room ("D126", "Kopierraum", "D.1.26");
Room room184 = new Room ("D127", "Lagerraum", "D.1.27");
Room room185 = new Room ("D128", "Biomedizinische Analytik Büro", "D.1.28");
Room room186 = new Room ("D129", "Biomedizinische Analytik Büro", "D.1.29");
Room room187 = new Room ("D130", "Vorbereitungsraum für Lehrende", "D.1.302");
Room room188 = new Room ("D131", "Biomedizinische Analytik Büro", "D.1.31");
Room room189 = new Room ("D132", "-", "D.1.32");
Room room190 = new Room ("D133", "Administration", "D.1.33");
Room room191 = new Room ("D134", "Biomedizinische Analytik Büro", "D.1.34"); //?

//Ebene: A.2
//Ebene: B.2
//Ebene: C.2
//Ebene: D.2
//Ebene: A.3
//Ebene: B.3
//Ebene: C.3
//Ebene: D.3
//Ebene: A.-1
//Ebene: B.-1
//Ebene: C.-1
//Ebene: D.-1
//Ebene: A.-2
//Ebene: B.-2
//Ebene: C.-2
//Ebene: D.-2


}

