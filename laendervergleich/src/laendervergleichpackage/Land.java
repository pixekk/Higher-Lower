package laendervergleichpackage;

public class Land {
    private String name;
    private double flaeche; // in Quadratkilometern
    private int bevoelkerung;

    // Konstruktor zum Initialisieren der Instanzvariablen
    public Land(String name, double flaeche, int bevoelkerung) {
        this.name = name;
        this.flaeche = flaeche;
        this.bevoelkerung = bevoelkerung;
    }

    // Getter und Setter für den Namen
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für die Fläche
    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    // Getter und Setter für die Bevölkerung
    public int getBevoelkerung() {
        return bevoelkerung;
    }

    public void setBevoelkerung(int bevoelkerung) {
        this.bevoelkerung = bevoelkerung;
    }
}