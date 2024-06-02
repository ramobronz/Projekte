package Konto;

public class Sparkonto extends Konto {

    public Sparkonto(Kunde inhaber, double zinsGuthaben) {
        super(inhaber, 0,  zinsGuthaben);
    }

    @Override
    public String toString() {
        return "Sparkonto" + "\n\t" +
                "Inhaber: " + getInhaber() + "\n\t" +
                "Zinsguthaben: " + getZinsGuthaben()+ "\n\t"+
                "Kontostand: " + getKontoStand();
    }
}
