import java.io.IOException;

public class Qudrat {
    public static void main(String[] args) throws IOException {
        System.out.println("willkomen in der quadrat Zeichner");
        System.out.println("---------------------------------");
        do {

            System.out.println("wie groß soll das Quadrat sein? ");
            int zaehler = IO.readInteger();
            System.out.println("---------------------------------");

            for (int zeile = 0; zeile < zaehler; zeile++) {

                if (zeile == 0 || zeile == zaehler - 1) {

                    for (int spalte = 0; spalte < zaehler; spalte++) {

                        System.out.print("*");

                    }

                    System.out.println("");

                } else {

                    System.out.print("*");

                    for (int space = 0; space < zaehler - 2; space++) {

                        System.out.print(" ");

                    }

                    System.out.println("*");

                }

            }
            System.out.println("wollen Sie nochmal zeichnen?");
        } while (IO.readBoolean());
    }
}

