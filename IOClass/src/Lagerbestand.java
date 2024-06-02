import java.io.IOException;
import java.text.DecimalFormat;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {
        DecimalFormat ds = new DecimalFormat("0.00");
        System.out.println("wie viel unterschiedliche Artikeln haben Sie in der Lager? ");
        int artikel = IO.readInteger();
        int[] artikel1 = new int[artikel];
        String[] eingabe = new String[artikel];

        for (int i = 0; i < artikel1.length; i++) {
            System.out.print("Artikel " + (i + 1) + ": ");
            eingabe[i] = IO.readString();
        }
        System.out.println(" ");
        System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels: ");
        double[] zahlen = new double[artikel];
        for (int i = 0; i < artikel1.length; i++) {
            System.out.print("preis pro " + eingabe[i] + ": ");
            zahlen[i] = IO.readDouble();

        }
        System.out.println(" ");
        System.out.println("erfassen Sie jetzt die Anzahl der einzeln Artikel: ");
        int[] menge = new int[artikel];
        int summeartikel = 0;
        for (int i = 0; i < artikel1.length; i++) {
            System.out.print("Menge des Artikels " + "'" + eingabe[i] + "': ");
            menge[i] = IO.readInteger();
            summeartikel += menge[i];
        }
        double zahl1 = 0;
        double summe = 0;
        for (int i = 0; i < artikel1.length; i++) {
            zahl1 = menge[i] * zahlen[i];
            summe += zahl1;

        }
        //rechnung
        System.out.println(" ");
        System.out.println("in ihre Lager befindet sich " + summeartikel + " Artekel im Wert von " + ds.format(summe) + "€");
    }
}

