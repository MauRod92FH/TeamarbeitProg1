package model;

/*
C.-2.01 CT Labor
C.-2.15 Duschen Damen und Männer
C. -2.16 Turnsaal + access to C.-2.23
C.-2.17 Männer Garderobe
C.-2.18 Frauen Garderobe
C-2.19 Dusche Frauen
C-2.14 WC
C.E.06 Raum der Stille, Wickel- und Stillraum; Zugang zu C.E.07-08
D.Z.05 Labor Immunhämatologie
D.Z.06 Labor Hämatologie, Immunhämatologie
D.Z.07 Labor Hämatologie, Immunhämatologie 
D.Z.14 Labor Zytologie
D.Z.16 Labor Zytologie
D.Z.17 WC MitarbeiterInnen
D.Z.21 Biomedizinische Analytik (Büro)
D.Z.22 Biomedizinische Analytik (Büro)
D.Z.23 Biomedizinische Analytik (Büro)
D.Z.24 Biomedizinische Analytik (Büro)
D.Z.25 Biomedizinische Analytik (Büro)
D.Z.30 Biomedizinische Analytik (Büro)
D.Z.30 Biomedizinische Analytik (Büro) Zugang zu D.Z.32-33
D.Z.26 Besprechungsraum
D.Z.28 Kopierraum
D.Z.27 Küche MitarbeiterInnen
B.E.05 WC barrierefrei
A.E.01. ÖH 
A.E.02 Bibliothek, Zugang neben ÖH
A.E.03 Bibliothek 
A.E.03 Bibliothek, Zugang von 
A.E.04 Technikraum

 */
public class Raum {
    String name; 
    String beschreibung; 

    public Raum(String name, String beschreibung) {
        this.name = name; 
        this.beschreibung = beschreibung; 
    }
}
