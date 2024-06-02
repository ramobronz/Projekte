import java.io.IOException;

public class benzinverbrauch {
    public static void main(String[] args) throws IOException {
        String antwort;
     do {



        System.out.println("Wie viel Km sind Sie gefahren?");
        double strecke = IO.readDouble();
double verbrauch = 0;


        if (strecke == 0) {
            System.out.println("Sie sind gar nicht gefahren, daher kann keine Rechnung durchgeführt werden");
        } else if (strecke < 0) {
            System.out.println("Rechnung nicht möglich");
        }
        else {
            System.out.println("wie viel Liter Benzin haben Sie verbraucht");
            verbrauch = IO.readDouble();
            double ergbnis = 100 * (verbrauch / strecke);
            System.out.println("Ihre Ergbnis lautet " + ergbnis);
        }
         System.out.println("möchten Sie die Rechnung zu wiederholen?");
        antwort=IO.readString();

     }while (antwort.equalsIgnoreCase("ja"));

    }
}
