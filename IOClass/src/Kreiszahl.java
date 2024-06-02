import java.io.IOException;

public class Kreiszahl {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib mir eine zahl für den Algorithmus: ");

        double p = IO.readDouble();
        double pi = Math.PI;
        double j = 0;
        double u = 0;
        double c = 0;
        for (double i = 0; i <= p; i++) {
            u = (Math.pow(-1, i));
            c += u / (2 * i + 1);
        }
        j = c * 4;
        System.out.println(j);
        double vergleich = j - pi;

        if (vergleich < 0) {
            vergleich = vergleich * -1;

        }
        System.out.println("Die Abweichung zu PI beträgt: " + vergleich);

    }
}
