package Tresor;

public class Aktie extends Gegenstand {
    private String unternehemn;
    private double nennwert;

    public Aktie(int id, double wert, String unternehemn, double nennwert) {
        super(id, wert);
        this.unternehemn = unternehemn;
        this.nennwert = nennwert;
    }

    public String getUnternehemn() {
        return unternehemn;
    }

    public void setUnternehemn(String unternehemn) {
        this.unternehemn = unternehemn;
    }

    public double getNennwert() {
        return nennwert;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    @Override
    public String toString() {
        return "Aktie" + "\n\t" +
                "ID: " + getId() + "\n\t" +
                "unternehemn: " + unternehemn + "\n\t" +
                "Nennwert: " + nennwert + "\n\t" +
                "Wert: " + getWert() + "€ ";
    }
}
