import java.io.IOException;

public class Summen {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viel zahlen wollen Sie schreiben");
        int anzahl = IO.readInteger();
        int zahlen[] = new int[anzahl];
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("geben Sie" + " " + (i + 1) + "\t");
            zahlen[i] = IO.readInteger();
        }
        int summegerade = 0;
        int anzahlgerade = 0;
        int summeungerade = 0;
        int anzahlungerade = 0;
        System.out.println("");
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] % 2 == 0) {
                anzahlgerade = anzahlgerade + 1;
                summegerade = summegerade + zahlen[i];

            } else {
                anzahlungerade = anzahlungerade + 1;
                summeungerade = summeungerade + zahlen[i];
            }
        }
        System.out.println("Anzahl der Gerade Zahlen " + anzahlgerade);
        System.out.println("Summe der gerade Zahlen " + summegerade);
        System.out.println("-----------------------------------------");
        System.out.println("Anzahl der ungerade Zahlen " + anzahlungerade);
        System.out.println("Summe der ungerade Zahlen " + summeungerade);
    }
}
