package Zahlensysteme;

import java.io.IOException;
import java.util.Arrays;

public class AsciiTabelle {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("DAS HABEN SIE ZUR WAHL");
            for (int i = 0; i < 128; i++) {
                System.out.print(" " + (i + 1) + ": " + (char) i + "");
                System.out.print("  ");
                if ((i + 1) % 11 == 0) {
                    System.out.println();
                }
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("wie viel Dezimal zahlen möchten Sie eingeben: ");
            int eingabe = IO.readInteger() - 1;
            if (eingabe + 1 >= 128) {
                System.out.println("die eingabe " + "[ " + (eingabe + 1) + " ]" + " ist außerhalb der grenze ");
                System.out.println("Wollen Sie großere Zahlen eingeben? ");
                boolean wahl = IO.readBoolean();
                if (wahl == true) {
                    do {
                        System.out.println("bis wie viel ASCII Zahlen möchten Sie haben?");
                        int eingabe1 = IO.readInteger();
                        for (int i = 0; i < eingabe1; i++) {
                            System.out.print(" " + (i + 1) + ": " + (char) i + "");
                            System.out.print("  ");
                            if ((i + 1) % 10 == 0) {
                                System.out.println();
                            }
                        }

                        System.out.println("Wählen Sie einer Zahl der Ascii Tabelle ");

                        int deziaml = IO.readInteger() - 1;
                        char ascii2 = (char) deziaml;
                        System.out.println("ASCCI character: " + ascii2);
                        System.out.println(" ");
                        System.out.println("Möchten Sie den Pogramm wiederholen? ");
                    } while (IO.readBoolean());
                    break;
                }

                if (!wahl) {
                    System.out.println(" ");
                    break;
                }
            }
            char ascii = (char) eingabe;
            System.out.println("ASCII character:" + ascii);
            System.out.println(" ");
            System.out.println("Möchten Sie den Pogramm wiederholen? ");
        } while (IO.readBoolean());
    }
}

