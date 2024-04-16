package laendervergleichpackage;

public class SpielLogik {
    private int richtigeAntworten;
    private int falscheAntworten;
    private int aktuelleVergleichNummer;
    private int vergleicheImSpiel;

    public SpielLogik() {
        this.richtigeAntworten = 0;
        this.falscheAntworten = 0;
        this.aktuelleVergleichNummer = 0;
        this.vergleicheImSpiel = 0;
    }

    // Startet ein neues Spiel
    public void neuesSpiel() {
        richtigeAntworten = 0;
        falscheAntworten = 0;
        aktuelleVergleichNummer = 0;
        vergleicheImSpiel = 0;
        // Hier könntest du Logik hinzufügen, um neue Länder zu laden oder zu mischen
    }

    // Prüft die Antwort des Benutzers
    public boolean pruefeAntwort(boolean benutzerWahl) {
        aktuelleVergleichNummer++;
        vergleicheImSpiel++;

        // Hier Logik einfügen, um die Antwort zu prüfen (true, wenn richtig; false, wenn falsch)
        boolean istRichtig = false; // Diese Variable entsprechend der Logik setzen

        if (istRichtig) {
            richtigeAntworten++;
        } else {
            falscheAntworten++;
        }

        return istRichtig;
    }

    public int getRichtigeAntworten() {
        return richtigeAntworten;
    }

    public int getFalscheAntworten() {
        return falscheAntworten;
    }

    public int getAktuelleVergleichNummer() {
        return aktuelleVergleichNummer;
    }

    public int getVergleicheImSpiel() {
        return vergleicheImSpiel;
    }

    // Hier könnten weitere Methoden folgen, z.B. zum Laden von Daten oder für Spielstatistiken
}
