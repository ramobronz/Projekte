package Zahlensysteme;

import java.io.IOException;

public class KonverterDual2Dezimal {
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("geben Sie ihre bänier Zahlen ein: ");
            String binary = IO.readString();
            int dezimal = Integer.parseInt(binary, 2);
            System.out.println("Dezimal Zahl beträgt: " + dezimal);
            System.out.println(" ");
            System.out.println("Möchten Sie nochmal rechnen?");

        }while (IO.readBoolean());
    }
}
