package Fussball;

public class Spiel {

    private final StringBuilder spielbericht;
    private final Mannschaft heimmanschaft;
    private final Mannschaft gastmannschaft;
    private final Ergebnis ergebnis;


    public Spiel(Mannschaft heimmannschaft, Mannschaft gastmannschaft) {
        this.heimmanschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
        this.spielbericht = new StringBuilder();
        this.ergebnis = new Ergebnis(0, 0);
    }

    public void addEvent(String event) {
        spielbericht.append(event).append("\n");
    }

    public Mannschaft getHeimmanschaft() {
        return heimmanschaft;
    }

    public Mannschaft getGastmannschaft() {
        return gastmannschaft;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }

    @Override
    public String toString() {
        return "Spiel" + "\n\t" +
                "spielverlauf:" + spielbericht + "\n\t" +
                "Eigen.Ergebnis:" + ergebnis + "\n\t";
    }


}
