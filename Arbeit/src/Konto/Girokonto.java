package Konto;

public class Girokonto extends Konto {
    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditLimit, double zinsGuthaben, double zinsKredit) {
        super(inhaber, kreditLimit, zinsGuthaben);
        this.zinsKredit = zinsKredit;
    }

    @Override
    public double getZinsGuthaben() {
        return super.getZinsGuthaben();
    }

    @Override
    public void setZinsGuthaben(double zinsGuthaben) {
        super.setZinsGuthaben(zinsGuthaben);
    }

    public boolean ueberweisen(double betrag, Girokonto girokonto) {
        if (betrag > getKreditLimit() + getKontoStand()) {
            System.out.println("auszahlung nicht erfolgreich, keine ausreichende kontostand und kredit");

            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Girokonto" + "\n\t" +
                "Inhaber: " + getInhaber() + "\n\t" +
                "Kreditlimit: " + getKreditLimit() + "\n\t" +
                "zinsguthaben: " + zinsKredit + "\n\t"+
                "Kontostand: " + getKontoStand();
    }
}
