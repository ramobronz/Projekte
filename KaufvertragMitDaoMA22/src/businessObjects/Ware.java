package businessObjects;


import java.util.ArrayList;


public class Ware {
    private int wareNr;
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten = new ArrayList<String>();
    private ArrayList<String> maengeel = new ArrayList<String>();

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getWareNr() {
        return wareNr;
    }

    public void setWareNr(int wareNr) {
        this.wareNr = wareNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public void addBesonderheiten(String besonderheitn) {
        this.besonderheiten.add(besonderheitn);
    }

    public ArrayList<String> getMaengeel() {
        return maengeel;
    }

    public void addMaengel(String maengel) {

        this.maengeel.add(maengel);

    }


    @Override

    public String toString() {

        return " Ware" +
                "Waren Nr.: " + wareNr + "\n\t" +
                "Bezeichnung:" + bezeichnung + "\n\t" +
                "Beschreibung: " + beschreibung + "\n\t" +
                "Preis: " + preis + "\n\t" +
                "Besonderheiten:" + besonderheiten + "\n\t" +
                "Maengeel: " + maengeel + "\n\t";

    }

}