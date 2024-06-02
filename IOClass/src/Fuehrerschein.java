import java.io.IOException;

public class Fuehrerschein {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind Sie?");
        int eingabe = IO.readInteger();
        boolean antwort;



        boolean a = (eingabe < 14);
        boolean b = (14 <= eingabe && eingabe < 16);
        boolean c = (16 <= eingabe && eingabe < 18);
        boolean d = (eingabe >= 18);



        if (a == true) {
            System.out.println("Du darfst Bobby-Car oder Fahrrad fahre");
        }
        if (b == true) {
            System.out.println("Du darfst schon 50er fahre");
        }
        if (c == true) {
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto");
        }
        if (d == true) {
            System.out.println("Du darfst jetzt Auto fahren");
        }

    }
}
