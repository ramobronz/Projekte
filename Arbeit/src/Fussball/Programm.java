package Fussball;

import java.util.ArrayList;

public class Programm {

    public static void main(String[] args) {


        System.out.println("Schritt 5:");

        // Eigen. Mannschaft 1

        Trainer trainer1 = new Trainer("Schaaf", 50, 8);

        Torwart torwart1 = new Torwart("Wiese", 38, 9, 10, 9);

        ArrayList<Spieler> spielerListe1 = new ArrayList<Spieler>();

        Spieler spieler1 = new Spieler("Frings", 45, 8, 7, 10, 30);

        spielerListe1.add(spieler1);

        spieler1 = new Spieler("Ailton", 40, 8, 9, 6, 50);

        spielerListe1.add(spieler1);

        Mannschaft team1 = new Mannschaft("Werder All Stars", trainer1, torwart1, spielerListe1);

        System.out.println(team1);

        // Eigen.Mannschaft 2

        Trainer trainer2 = new Trainer("Weißnix", 50, 8);

        Torwart torwart2 = new Torwart("Hältnix", 43, 9, 6, 9);

        ArrayList<Spieler> spielerListe2 = new ArrayList<Spieler>();

        Spieler spieler2 = new Spieler("Siehtnix", 35, 8, 7, 10, 30);

        spielerListe2.add(spieler2);

        spieler2 = new Spieler("Trifftnix", 50, 8, 9, 6, 50);

        spielerListe2.add(spieler2);
        Mannschaft team2 = new Mannschaft("Luschen HSV", trainer2, torwart2, spielerListe2);
        System.out.println(team2);


        // Eigen.Spiel

        Spiel spiel = new Spiel(team1, team2);

        System.out.println(spiel);


        try {
            Gameplay.spielen(spiel);
            System.out.println(spiel.getSpielbericht());
            System.out.println(spiel.getErgebnis());
        } catch (SpielAbbruchException e) {
            System.out.println(spiel.getSpielbericht());
            System.out.println(e.getMessage() + spiel.getErgebnis());
        }
        //System.out.println("Eigen.Ergebnis " + spiel.getErgebnis().getToreHeim() + ":" + spiel.getErgebnis().getToreGast());

    }
}