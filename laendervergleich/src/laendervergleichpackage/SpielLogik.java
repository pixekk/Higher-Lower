package laendervergleichpackage;

import java.util.ArrayList;

public class SpielLogik {
    private ArrayList<Land> laenderListe;
    private int richtigeAntworten;
    private int falscheAntworten;
    private int aktuelleVergleichNummer;
    private int vergleicheImSpiel;
    private Land[] aktuelleLaender;

    public SpielLogik() {
        this.laenderListe = new ArrayList<>();
        initialisiereLaender(); // Initialisiert die Liste beim Erstellen der SpielLogik-Instanz
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

    public void starteSpiel() {
        this.aktuelleLaender = waehleZufaelligeLaender(); // Wählt zwei Länder beim Start des Spiels
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

    // Initialisiert die Liste der EU-Länder
    private void initialisiereLaender() {
        laenderListe.add(new Land("Deutschland", 357022, 83149300));
        laenderListe.add(new Land("Frankreich", 551695, 67391582));
        laenderListe.add(new Land("Italien", 301340, 60317116));
        laenderListe.add(new Land("Spanien", 505990, 47351567));
        laenderListe.add(new Land("Polen", 312696, 38386000));
        laenderListe.add(new Land("Rumänien", 238397, 19237691));
        laenderListe.add(new Land("Niederlande", 41543, 17441139));
        laenderListe.add(new Land("Belgien", 30528, 11589623));
        laenderListe.add(new Land("Griechenland", 131957, 10423054));
        laenderListe.add(new Land("Tschechische Republik", 78865, 10708981));
        laenderListe.add(new Land("Portugal", 92090, 10281762));
        laenderListe.add(new Land("Schweden", 450295, 10327589));
        laenderListe.add(new Land("Ungarn", 93028, 9660351));
        laenderListe.add(new Land("Österreich", 83871, 8915115));
        laenderListe.add(new Land("Bulgarien", 110879, 6951482));
        laenderListe.add(new Land("Dänemark", 43094, 5818553));
        laenderListe.add(new Land("Finnland", 338424, 5540720));
        laenderListe.add(new Land("Slowakei", 49037, 5459642));
        laenderListe.add(new Land("Irland", 70273, 4937786));
        laenderListe.add(new Land("Kroatien", 56594, 4105267));
        laenderListe.add(new Land("Litauen", 65300, 2722289));
        laenderListe.add(new Land("Slowenien", 20273, 2078938));
        laenderListe.add(new Land("Lettland", 64559, 1886198));
        laenderListe.add(new Land("Estland", 45227, 1326535));
        laenderListe.add(new Land("Zypern", 9251, 1207359));
        laenderListe.add(new Land("Luxemburg", 2586, 625978));
        laenderListe.add(new Land("Malta", 316, 441543));
    }
    public Land[] waehleZufaelligeLaender() {
        if (laenderListe.size() < 2) {
            return null; // Sicherstellen, dass die Liste mindestens zwei Länder enthält
        }
        
        int index1 = (int) (Math.random() * laenderListe.size());
        int index2 = index1;
        // Sicherstellen, dass index2 nicht gleich index1 ist
        while (index2 == index1) {
            index2 = (int) (Math.random() * laenderListe.size());
        }

        Land land1 = laenderListe.get(index1);
        Land land2 = laenderListe.get(index2);
        
        return new Land[] {land1, land2};
    }

    public Land[] getAktuelleLaender() {
        return aktuelleLaender;
    }

}
