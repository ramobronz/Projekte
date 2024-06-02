package Zahlensysteme;

import java.io.IOException;

public class uben {
    public static void main(String[] args) throws IOException {
        System.out.print("geben Sie ihre Binär Zahl ein: ");
        String binear = IO.readString();
        int bin1 = Integer.parseInt(binear, 2);

        System.out.print("geben SIe ihre zweite binär Zahl ein: ");
        String binear2 = IO.readString();
        int bin2 = Integer.parseInt(binear2, 2);

        int summe = bin1 + bin2;
        String sum = Integer.toBinaryString(summe);
        System.out.println(" ");
        System.out.println("Ihre Summe in Dezimale Zahlen lautet: ");
        System.out.println(summe);
        System.out.println(" ");
        System.out.println("Ihre Binäre Summe lautet: ");
        System.out.println(sum);
    }
}
