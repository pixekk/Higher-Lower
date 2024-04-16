package laendervergleichpackage;

import java.awt.EventQueue;

public class Startklasse {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();  // Erstellt ein neues GUI-Objekt
                    frame.setVisible(true);  // Macht das GUI-Fenster sichtbar

                    SpielLogik spielLogik = new SpielLogik(); // Erstellt eine neue Instanz der SpielLogik
                    spielLogik.starteSpiel(); // Startet das Spiel und wählt zwei zufällige Länder aus

                    // Ausgabe der ausgewählten Länder in der Konsole (optional)
                    Land[] aktuelleLaender = spielLogik.getAktuelleLaender();
                    if (aktuelleLaender != null) {
                        System.out.println("Land 1: " + aktuelleLaender[0].getName() + " - Bevölkerung: " + aktuelleLaender[0].getBevoelkerung() + " - Fläche: " + aktuelleLaender[0].getFlaeche());
                        System.out.println("Land 2: " + aktuelleLaender[1].getName() + " - Bevölkerung: " + aktuelleLaender[1].getBevoelkerung() + " - Fläche: " + aktuelleLaender[1].getFlaeche());
                    } else {
                        System.out.println("Nicht genügend Länder in der Liste vorhanden.");
                    }
                } catch (Exception e) {
                 e.printStackTrace();
                }
            }
        });
    }
}

