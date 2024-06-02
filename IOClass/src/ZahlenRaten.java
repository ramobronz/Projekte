import java.io.IOException;

public class ZahlenRaten {
    public static void main(String[] args) throws IOException {
        System.out.println("willkommen bei ihre Zahlenraten");


        String wiederholung;
        do {
            System.out.println("ist ihre Zahl eine gerade Zahl");
            System.out.println("Ja oder Nein?");
            String text = IO.readString();


            if (text.equals("ja")) {
                System.out.println("kann diese zahl durch 5 geteilt werden?");
                String text1 = IO.readString();


                if (text1.equals("ja")) {
                    System.out.println("was ergibt dein Zahl durch 5?");
                    int a = IO.readInteger();
                    int ergbnis = a * 5;
                    System.out.println("ihre Zahl lautet" + ergbnis);

                } else if (text1.equals("nein")) {
                    System.out.println("kann durch 2 geteilt werden?");
                    String text3 = IO.readString();

                    if (text3.equals("ja")) {
                        System.out.println("wie viel ergibt dein zahl durch 2?");
                        double zahlDobel = IO.readDouble();
                        double ergbnis2 = zahlDobel * 2;
                        System.out.println("dein Zahl ist " + ergbnis2);
                    } else if (text3.equals("nein")) {
                        System.out.println("kann ihre zahl durch 3 geteilt werden?");
                        String text4 = IO.readString();
                        if (text4.equals("ja")) {
                            System.out.println("wie viel ergibt dein Zahl durch 3?");
                            double zahl3 = IO.readDouble();
                            double ergbnis = zahl3 * 3;
                            System.out.println("ihre Zahl lautet " + ergbnis);


                        } else if (text4.equals("nein")) {
                            System.out.println("ihre ergbnis lautet= 1 ");
                        }
                    }


                }
            } else if (text.equals("nein")) {
                System.out.println("wenn Sie 1- machen wird es null?");
                String frage1 = IO.readString();
                if (frage1.equals("ja")) {
                    System.out.println("ihre ergebnis lautet: 1");
                } else if (frage1.equals("nein")) {
                    System.out.println("dann machen Sie -1 und teilen Sie durch 2");
                    System.out.println("wie viel ergibt das");
                    double fragezahl = IO.readDouble();
                    double ergbnis = fragezahl * 2 + 1;
                    System.out.println("ihre Zahl ist= " + ergbnis);
                }
            }
            System.out.println("wollen Sie nochmal spielen");
            wiederholung = IO.readString();

        } while (wiederholung.equals("ja"));
    }
}
