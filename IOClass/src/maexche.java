
import java.io.IOException;

public class maexche {
    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen bei Mäxchen");
        boolean antwort;

        do {

            System.out.println("geben Sie ihre erste Wurf");
            int a = IO.readInteger();


            System.out.println("geben Sie ihre zweite Wurf");
            int b = IO.readInteger();

            if (a > 7 && b > 7) {
                System.out.println("nicht möglich bitte geben Sie maximal bis 6 ein");
                System.out.println("wiederholen Sie den Porgramm");
                break;
            }


            if (a == 2 && b == 1) {

                System.out.println("Mäxchen! Sie haben 1000 Punkte erreicht");
            } else if (a == 1 && b == 2) {
                System.out.println("Mäxchen! Sie haben 1000 Punkte erreicht");
            } else if (a == b) {
                System.out.println("Pasch! Sie haben 100 Punkte erreicht");
            } else if (a < b && b > a) {
                int ergbnis = a + b + 10;
                System.out.println("Sie habe " + ergbnis + " Punkte erreicht");


            } else {
                System.out.println("Error");

            }

            System.out.println("Nochmal werfen?");
            antwort = IO.readBoolean();

        } while (antwort);

    }

}