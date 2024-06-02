package Konto;


public class Kunde extends Person {
    private Mitarbeiter betreuer;

    public Kunde(String vorname, String nachname, Mitarbeiter betreuer) {
        super(vorname, nachname);
        this.betreuer = betreuer;
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde" + "\n\t" +
                "Vorname: " + getVorname() + "\n\t" +
                "Nachname: " + getNachname() + "\n\t" +
                "Betreuer: " + betreuer.getVorname()+ " " + betreuer.getNachname()+ "\n\t" +
                "Adresse" + getAdresse();
    }
}
