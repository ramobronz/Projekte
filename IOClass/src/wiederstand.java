
import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Locale;

public class wiederstand {


    public static void main(String[] args) throws IOException {


        System.out.println("geben Sie ihre erste schaltungsart");

        String eingabe = IO.readString();


        switch (eingabe.toLowerCase(Locale.ROOT)) {

            case "p":

                System.out.println("geben Sie r1 ein");

                String eingabe2 = IO.readString();

                double a = Double.parseDouble(eingabe2.replace(",", "."));

                System.out.println("geben sie r2 ein");

                double b = Double.parseDouble(IO.readString().replace(",", "."));

                double ergbnis = (a * b) / (a + b);

                System.out.println(ergbnis);

                break;


            case "r":

                System.out.println("geben Sie r1 ein");

                String eingabe3 = IO.readString();

                double x = Double.parseDouble(eingabe3.replace(",", "."));

                System.out.println("geben Sie r2 ein");

                double y = Double.parseDouble(IO.readString().replace(",", "."));

                double ergbnis2 = x + y;

                System.out.println(ergbnis2);

                break;


            default:

                System.out.println("Unbekannt");

        }

    }

}


