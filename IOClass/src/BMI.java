import java.io.IOException;
import java.util.Locale;

public class BMI {
    public static void main(String[] args) throws IOException {
        String antwort;
do {


        System.out.println("Sind Sie Männlich oder Weiblich");
        String umi = IO.readString();

        switch (umi.toLowerCase(Locale.ROOT)) {
            case "m", "männlich", "mann", "junge":
                System.out.println("wie viel wiegen Sie in Kg?");
                double gewischtm = IO.readDouble();
                System.out.println("wie groß sind Sie in cm");
                double grossm = IO.readDouble();
                double bmim = gewischtm / Math.pow(grossm / 100, 2);


                if (bmim < 20) {
                    System.out.println("Untergewischt");
                } else if (20 <= bmim && bmim < 25) {
                    System.out.println("Normalgewicht");
                } else if (25 <= bmim && bmim < 30) {
                    System.out.println("Übergewicht");
                } else if (30 <= bmim && bmim < 40) {
                    System.out.println("Adipositas");
                } else if (bmim >= 40) {
                    System.out.println("Starke Adipositas");
                } else {
                    System.out.println("antwort kenn ich nicht");
                }
                break;


            case "weiblich", "w", "frau", "mädchen":
                System.out.println("wie viel wiegen Sie in Kg?");
                double gewischtw = IO.readDouble();
                System.out.println("wie groß sind Sie in cm");
                double grossw = IO.readDouble();
                double bmiw = gewischtw / Math.pow(grossw / 100, 2);
                if (bmiw < 19) {
                    System.out.println("Untergewischt");
                } else if (19 <= bmiw && bmiw < 24) {
                    System.out.println("Normalgewicht");
                } else if (24 <= bmiw && bmiw < 30) {
                    System.out.println("Übergewicht");
                } else if (30 <= bmiw && bmiw < 40) {
                    System.out.println("Adipositas");
                } else if (bmiw >= 40) {
                    System.out.println("Starke Adipositas");
                } else {
                    System.out.println("antwort kenn ich nicht");
                }
                break;

            default:
                System.out.println("antwort kann ich nicht");

        }
    System.out.println("möchten Sie noch eine Vrsuch durchführen");
        antwort=IO.readString();
        }while (antwort.equalsIgnoreCase("ja"));
    }
}
