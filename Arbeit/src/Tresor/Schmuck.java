package Tresor;

public class Schmuck extends Gegenstand {

    private String bezeichnung;

    public Schmuck(int id, double wert, String bezeichnung) {
        super(id, wert);
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Schmuck " + "\n\t" +
                "bezeichnung: " + bezeichnung + "\n\t" +
                "ID: " + getId() + "\n\t" +
                "Wert: " + getWert() + "€ " + "\n\t";


    }
}
