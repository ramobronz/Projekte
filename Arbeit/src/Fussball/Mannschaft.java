package Fussball;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public int getModivation() {
        int mittelwert = torwart.getMotivation();
        for (Spieler player1 : spielerListe) {
            int player = player1.getMotivation();
            mittelwert += player;
        }
        return mittelwert / (spielerListe.size() + 1);
    }

    public int getStearke() {
        int mittelwert2 = torwart.getStarke();
        for (Spieler player1 : spielerListe) {
            int player = player1.getStarke();
            mittelwert2 += player;
        }
        return mittelwert2 / (spielerListe.size() + 1);
    }

    @Override

    public String toString() {
        return "Eigen.Mannschaft" + "\n\t" +
                "Name=" + name + "\n\t" +
                "Eigen.Trainer=" + trainer + "\n\t" +
                "Eigen.Torwart=" + torwart + "\n\t" +
                "SpielerListe=" + spielerListe + "\n\t";
    }
}
