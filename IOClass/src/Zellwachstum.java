import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {
        System.out.println("bitte die aktuelle zellmenge eingeben?");
        double menge= IO.readDouble();
        System.out.println("wachstumfaktor eingeben");
        double faktor= IO.readDouble();
        System.out.println("die laufzeit der Hochrechnung in Tagen eingeben");
        int tage=IO.readInteger();
        System.out.println("Tagen " + "      Zellmenge");
        for (int i=0; i <= tage; i++){
            double summe = menge * Math.pow(faktor,i);
            System.out.println(i + "           " + summe);

        }

    }
}
