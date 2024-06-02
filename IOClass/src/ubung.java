import java.io.IOException;
import java.util.Arrays;

public class ubung {
    public static void main(String[] args) throws IOException {
        double[] wert;
        do {

            System.out.println("geben Sie ein wert ein");
            int werte = IO.readInteger();
            wert = new double[werte];
            berechneMittelwert(wert);
            berechneVarianz();
            ermittelnMin(wert);
            ermittelnMax(wert);
            berechneStandertabweichung(wert);

            System.out.println("Soll das Porgramm wiederholt werden?");
        } while (IO.readBoolean());


    }

    public static void ErfassteZahlausgeben(double[] wert, int werte) {
        for (int i = 0; i < werte; i++) {
            System.out.println(wert[i]);
        }
    }

    public static void ermittelnMin(double[] wert) {
        System.out.println("Das Minimum ist " + wert[0]);

    }

    public static void ermittelnMax(double[] wert) {
        Arrays.sort(wert);
        System.out.println("Das Maximum ist " + wert[wert.length - 1]);
    }

    public static void berechneMittelwert(double[] wert) throws IOException {
        double summe = 0;
        for (int i = 0; i < wert.length; i++) {
            System.out.println("Wert " + (i + 1) + " : ");
            wert[i] = IO.readDouble();
            summe = summe + wert[i];
        }
        System.out.println("Die Mittelwert lautet: " + summe / wert.length);
    }

    public static void berechneVarianz() {
        //Fehlt
    }

    public static void berechneStandertabweichung(double[] wert) {
        double summe = 0;
        double mittelwert = (summe / wert.length);
        double std = 0;
        for (int i = 0; i < wert.length; i++) {
            std = Math.sqrt(1.0 / (wert.length - 1)) * Math.pow(wert[i] - mittelwert, 2);
            System.out.println("Die Standertabweichung ist: " + std);

        }
    }
}