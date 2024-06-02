import java.io.IOException;


public class Temperaturschwankung {

    public static void main(String[] args) throws IOException {
        System.out.println("wie viele Tage wollen Sie bitte");
        int x= IO.readInteger();
        double max = 0;
        double min = 0;
        double summe = 0;

        double[] tag = new double[x];
        for (int i = 0; i < tag.length; i++) {
            System.out.println("Temperatur an Tag " + (i + 1));
            double speicher = IO.readDouble();
            tag[1] = speicher;
            summe += speicher;
            if (i == 0) {
                max = speicher;
                min = speicher;
            } else {
                max = Math.max(max, speicher);
                min = Math.min(min, speicher);
            }
        }
        double mittelwert = Math.round(summe / tag.length);
        System.out.println("Mittelwert = " + mittelwert);
        System.out.println("Maximale Temperatur = " + max);
        System.out.println("Minimale Temperatur = " + min);
        double spannweite = max - min;
        System.out.println("Spannweite = " + spannweite);

    }

}