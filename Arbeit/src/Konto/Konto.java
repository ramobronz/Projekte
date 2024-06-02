package Konto;

public abstract class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
        this.kontoStand = 0;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void einzahlen(double betrag) {
        kontoStand = kontoStand + betrag;
    }

    public boolean auszahlen(double betrag) {
        if (betrag > 0 && betrag > kontoStand + kreditLimit) {
            System.out.println("dein Kontostand und Kreditlimit reicht nicht aus");
            return false;
        } else {
            kontoStand = kontoStand - betrag;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Konto " + "\n\t" +
                "inhaber: " + inhaber + "\n\t" +
                "kontoStand: " + kontoStand + "\n\t" +
                "kreditLimit: " + kreditLimit + "\n\t" +
                "zinsGuthaben: " + zinsGuthaben;
    }
}
