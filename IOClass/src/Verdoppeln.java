import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
        System.out.print("Wie viele Werte? ");
        int wert = IO.readInteger();
        double[] komma = new double[wert];
        double zahl = 0;

        for (int i = 0; i < komma.length; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            komma[i] = IO.readDouble();
        }
        System.out.println("Ursprüngliches Array : ");
        for (int i = 0; i < komma.length; i++) {
            System.out.print(komma[i] + "\t\t\t");
        }
        System.out.println("");
        System.out.println("Verdoppelte Array: ");
        for (int i = 0; i < komma.length; i++) {
            zahl = komma[i] * 2;
            System.out.print(zahl + "\t\t\t");
        }
    }
}