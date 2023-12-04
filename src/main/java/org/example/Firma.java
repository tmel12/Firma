package org.example;

public class Firma {
    private String name;
    private String adresse;
    private int anzahlRaume;
    private final int maxRaume;
    private int[] raumGroessen;
    private boolean[] raumBuchungen;

    public Firma(String name, String adresse, int maxRaume) {
        this.name = name;
        this.adresse = adresse;
        this.maxRaume = maxRaume;
        this.raumGroessen = new int[maxRaume];
        this.raumBuchungen = new boolean[maxRaume];
        this.anzahlRaume = 0;
    }

    public void fuegeRaumHinzu(int plaetze) {
        if (anzahlRaume < maxRaume) {
            raumGroessen[anzahlRaume] = plaetze;
            raumBuchungen[anzahlRaume] = false;
            anzahlRaume++;
        }
    }

    public int sucheRaum(int plaetze) {
        for (int i = 0; i < anzahlRaume; i++) {
            if (!raumBuchungen[i] && raumGroessen[i] >= plaetze) {
                return i;
            }
        }
        return -1;
    }

    public int anzahlFrei() {
        int freieRaume = 0;
        for (int i = 0; i < anzahlRaume; i++) {
            if (!raumBuchungen[i]) {
                freieRaume++;
            }
        }
        return freieRaume;
    }

    // Getter-Methoden für die Eigenschaften
    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAnzahlRaume() {
        return anzahlRaume;
    }

    public int getMaxRaume() {
        return maxRaume;
    }
}
