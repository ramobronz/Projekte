import java.io.IOException;


public class sBahn {

    public static void main(String[] args) throws IOException {
        System.out.println("willommen in Ihre S-Bahn");
        System.out.println("in welche station befinden Sie sich?");
        int station = IO.readInteger();
        System.out.println("wohin möchten Sie fahren?");
        int station2 = IO.readInteger();
        int grundpreis = 2;
        int endstationpreis = 3;
        int stationergebnis = station - station2 + 2;
        int grundpreissumme = station - station2;
        if (station == 0 && station2 == 11 || station == 11 && station2 == 0 || stationergebnis == 3 || stationergebnis == -3 || stationergebnis == 61 || stationergebnis == 51 + 2 || stationergebnis == 41 + 2
                || stationergebnis == 31 + 2 || stationergebnis == 21 + 2 || stationergebnis == -61 + 2 || stationergebnis == -51 + 2 || stationergebnis == -41 + 2
                || stationergebnis == -31 + 2 || stationergebnis == -21 + 2) {
            int nachbarPreis = 1;
            System.out.println("Sie müssen " + nachbarPreis + "€ beazahlen");


        } else if (grundpreissumme > 2) {
            System.out.println("Sie müssen " + grundpreis + "€ beazahlen");
        } else if (station == 0 && station2 == 16 || station == 0 && station2 == 26 || station == 0 && station2 == 36 || station == 0 && station2 == 46
                || station == 0 && station2 == 56 || station == 16 && station2 == 0 || station == 26 && station2 == 0 || station == 36 && station2 == 0
                || station == 46 && station2 == 0 || station == 56 && station2 == 0) {
            System.out.println("Sie müssen " + endstationpreis + " € beazahlen");

        } else {
            System.out.println("scheiße");
        }

    }

}





