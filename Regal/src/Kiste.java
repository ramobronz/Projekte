public class Kiste extends Behaelter {
    private double laenge;
    private double breite;


    public Kiste(String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax, double hoehe, double laenge, double breite) {
        super(behaelterNr, gewichtBehaelter, gewichtInhalt, gewichtInhaltMax, hoehe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        return "Kiste: " + super.toString() +
                "Länge: " + laenge + "\n\t" +
                "Breite: " + breite;
    }
}
