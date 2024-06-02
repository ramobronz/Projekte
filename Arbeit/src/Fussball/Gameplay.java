package Fussball;

import java.util.Random;

public class Gameplay {


    private static final int spielzeit = 90;

    private static final int MaxNachspielzeit = 5;

    private static final int MaxAktion = 10;


    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {


        int mannschaftsWert = mannschaft.getStearke() * mannschaft.getModivation() * mannschaft.getTrainer().getErfahrung();


        mannschaftsWert = Math.max(1, mannschaftsWert);


        return mannschaftsWert;


    }

    public static void brecheSpielAb(int spielminute) throws SpielAbbruchException {
        Random random = new Random();
        int zufallszahl = random.nextInt(999);
        if (zufallszahl == 0) {
            throw new SpielAbbruchException(spielminute);
        }
    }

    private static boolean erzielTor(Spieler schuetze, Torwart torwart) {

        boolean getroffen;

        Random random = new Random();

        int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;

        schuss = Math.max(1, schuss);

        int abwehr = torwart.getReaktion() * random.nextInt(5) - 2;

        abwehr = Math.max(1, abwehr);

        if (schuss > abwehr) {


            getroffen = true;

        } else {

            getroffen = false;

        }

        return getroffen;

    }


    public static void spielen(Spiel spiel) throws SpielAbbruchException {

        Random random = new Random();

        Mannschaft offensiv;

        Mannschaft deffensiv;

        int spielDauer = spielzeit + random.nextInt(MaxNachspielzeit + 1);

        int spielminute = 1 + random.nextInt(MaxAktion + 1);

        do {
            brecheSpielAb(spielminute);

            int heimwert = ermittelMannschaftsWert(spiel.getHeimmanschaft());

            int gastwert = ermittelMannschaftsWert(spiel.getGastmannschaft());

            int summe = heimwert + gastwert;

            int zufall = random.nextInt(summe + 1);

            if (heimwert <= gastwert) {

                offensiv = spiel.getGastmannschaft();

                deffensiv = spiel.getHeimmanschaft();

            } else {

                offensiv = spiel.getHeimmanschaft();

                deffensiv = spiel.getGastmannschaft();

            }

            int schuetzeNr = random.nextInt(offensiv.getSpielerListe().size());

            Spieler schuetze = offensiv.getSpielerListe().get(schuetzeNr);


            boolean getroffen = erzielTor(schuetze, deffensiv.getTorwart());

            if (getroffen) {

                offensiv.getSpielerListe().get(schuetzeNr).addTor();

                if (offensiv == spiel.getHeimmanschaft()) {

                    spiel.getErgebnis().heimtor();

                } else {

                    spiel.getErgebnis().gasttor();

                }

                spiel.getSpielbericht().append(spielminute).append(": Tor von ").append(offensiv.getSpielerListe().get(schuetzeNr).getName() + "\n\t");

            } else {

                spiel.getSpielbericht().append(spielminute).append(": Schuss von ").append(offensiv.getSpielerListe().get(schuetzeNr).getName() + "\n\t");

            }

            spielminute = spielminute + random.nextInt(MaxAktion + 1);

        } while (spielminute <= spielDauer);

    }
}
