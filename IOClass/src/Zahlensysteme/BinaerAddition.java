package Zahlensysteme;

import java.io.IOException;

public class BinaerAddition {
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("geben Sie die erste binär Zahlen ein: ");
            String binear1 = IO.readString();
            int bin = Integer.parseInt(binear1, 2);
            System.out.print("Enter the second binary number: ");
            String binaer2 = IO.readString();

            int bin1 = Integer.parseInt(binaer2, 2);
            int sum = Integer.parseInt(binear1, 2) + Integer.parseInt(binaer2, 2);
            String summe = Integer.toBinaryString(sum);

            System.out.println(" ");
            System.out.println("Zahl 1: " + binear1);
            System.out.println("Zahl 2: " + binaer2);
            System.out.println("Die summe ihre Binär Lautet: " + summe);
            System.out.println(" ");
            System.out.println("Möchten Sie noch ein weitere Rechnung durchführen? ");
        } while (IO.readBoolean());
    }
}

