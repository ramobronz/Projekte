import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class bestellung {
    public static void main(String[] args) throws IOException {
        String eingabe;
        boolean antwort;


        do {


            System.out.println("Wie viel Schraube wollen Sie bestellen?");

            double schrauben = IO.readDouble();


            System.out.println("Wie viel Muttern wollen Sie bestellen");
            double muttern = IO.readDouble();


            System.out.println("Wie viel Unterlegscheiben wollen Sie bestellen");
            double unterlegscheiben = IO.readDouble();



            if (muttern == schrauben) {
                double ergbnis = schrauben * 0.05 + muttern * 0.03 + unterlegscheiben * 0.01;
                System.out.println("Bestellung möglich ");
                System.out.println(ergbnis);
                System.out.println("Möchten Sie nochmal bestellen?");


            } else {
                System.out.println("Bestellung nicht möglich");
                System.out.println("Widerholen sie ihre bestellung");

            }
            antwort = IO.readBoolean();

        } while (antwort==true);


    }
}
