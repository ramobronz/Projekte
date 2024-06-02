import java.util.ArrayList;
import java.util.Objects;

public class Regal {
    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> behaelterListe;

    public Regal(Lagerhalle lagerhalle) {
        this.lagerhalle = lagerhalle;
        behaelterListe = new ArrayList<>();
    }

    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }

    public void addBehaelter(Behaelter behaelter) {
        behaelterListe.add(behaelter);
    }

    public void removeBehaelter(Behaelter behaelter) throws BehaelterNichtGefundenException {
        for (Behaelter behaelter1 : behaelterListe) {
            if (behaelter1.equals(behaelterListe)) {
                throw new BehaelterNichtGefundenException(behaelter.getBehaelterNr());
            }
            behaelterListe.remove(behaelter);
        }
    }

    public Behaelter getbehaelter(String behaelterNr) throws BehaelterNichtGefundenException {
        for (Behaelter behalt : behaelterListe) {
            if (Objects.equals(behalt.getBehaelterNr(), behaelterNr)) {
                return behalt;
            }
        }
        throw new BehaelterNichtGefundenException(behaelterNr);
    }

    public int getanzahlBehaelter() {
        int gesamtwert = 0;
        for (Behaelter behaelterWert : behaelterListe) {
            gesamtwert++;
        }
        return gesamtwert;
    }

    public double getGewichtGesamt() {
        double gesamtwert = 0;
        for (Behaelter behaelterWert : behaelterListe) {
            double summe = behaelterWert.getGewichtInhalt();
            gesamtwert += summe;
        }
        return gesamtwert;
    }

    @Override
    public String toString() {
        return "Regal{" +
                "Lagerhalle=" + lagerhalle +
                "BehaelterListe=" + behaelterListe;
    }
}

