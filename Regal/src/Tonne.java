public class Tonne extends Behaelter {
    private double durchmesser;

    public Tonne(String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax, double hoehe, double durchmesser) {
        super(behaelterNr, gewichtBehaelter, gewichtInhalt, gewichtInhaltMax, hoehe);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "Tonne{" + super.toString() +
                "durchmesser=" + durchmesser;
    }
}
