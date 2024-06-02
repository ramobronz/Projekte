public abstract class Behaelter {
    private String behaelterNr;
    private double gewichtBehaelter;
    private double gewichtInhalt;

    private double gewichtInhaltMax;
    private double hoehe;


    public Behaelter(String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax, double hoehe) {
        this.behaelterNr = behaelterNr;
        this.gewichtBehaelter = gewichtBehaelter;
        this.gewichtInhalt = gewichtInhalt;
        this.gewichtInhaltMax = gewichtInhaltMax;
        this.hoehe = hoehe;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public void setBehaelterNr(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public double getGewichtBehaelter() {
        return gewichtBehaelter;
    }

    public void setGewichtBehaelter(double gewichtBehaelter) {
        this.gewichtBehaelter = gewichtBehaelter;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public void setGewichtInhalt(double gewichtInhalt) {
        this.gewichtInhalt = gewichtInhalt;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    @Override
    public String toString() {
        return "Behaelter{" +
                "behaelterNr='" + behaelterNr + '\'' +
                ", gewichtBehaelter=" + gewichtBehaelter +
                ", gewichtInhalt=" + gewichtInhalt +
                ", gewichtInhaltMax=" + gewichtInhaltMax +
                ", hoehe=" + hoehe +
                '}';
    }
}
