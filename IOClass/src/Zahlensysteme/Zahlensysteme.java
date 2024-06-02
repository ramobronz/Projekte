package Zahlensysteme;

import Zahlensysteme.IO;

import java.io.IOException;

public class Zahlensysteme {
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Geben Sie bitte den dezimalzahl ein: ");
            int dezimalzahl = IO.readInteger();

            StringBuilder bin = new StringBuilder(" ");

            System.out.println("Binearzahl ist: ");

            while (dezimalzahl > 0) {
                bin.insert(0, dezimalzahl % 2);
                dezimalzahl = dezimalzahl / 2;
            }
            System.out.println(bin);
            System.out.println("möchten Sie nochmal rechnen?");
        } while (IO.readBoolean());
    }
}