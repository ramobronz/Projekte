package Tresor;

import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstaende;

    public Tresor() {
        this.gegenstaende = new ArrayList<Gegenstand>();
    }

    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException {
        for (Gegenstand gegenstand : gegenstaende) {
            if (gegenstand.getId() == id) {
                return gegenstand;
            }
        }
        throw new GegenstandNichtGefundenException(id);
    }

    public void addGegenstand(Gegenstand gegenstand) {
        this.gegenstaende.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException {
        boolean ok;
        ok = gegenstaende.remove(gegenstand);
    }
    public double berechneGesamtwert() {
        double gesamtwert = 0;
        for (Gegenstand gegenstand : gegenstaende) {
            gesamtwert += gegenstand.getWert();
        }
        return gesamtwert;
    }

    public String toString() {
        String output = "Tresorinhalt:\n";
        for (Gegenstand gegenstand : gegenstaende) {
            output += gegenstand.toString() + "\n";
        }
        output += "Gesamtwert: " + berechneGesamtwert() + "€ " + "\n";
        return output;
    }
}
