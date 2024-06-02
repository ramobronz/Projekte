import java.io.IOException;

public class lieferbeziehungen {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Artiekel haben Sie? ");
        int artiekel = IO.readInteger();
        System.out.println("wie viele Kunden haben Sie? ");
        int kunde = IO.readInteger();
        System.out.println("geben Sie Matrix für Januar an ");
        int[][] januar = new int[artiekel][kunde];

        for (int i = 0; i < januar.length; i++) {
            for (int s = 0; s < januar[i].length; s++) {
                System.out.print("Artiekel " + (i + 1) + " für den Kunde " + (s + 1) + ": ");
                januar[i][s] = IO.readInteger();

            }
        }
        System.out.println("Geben Sie nun die Matrix Februar ein ");
        int[][] februar = new int[januar.length][januar[0].length];
        for (int i = 0; i < artiekel; i++) {
            for (int s = 0; s < kunde; s++) {
                System.out.println("Ware " + (i + 1) + " für Kunde " + (s + 1) + ": ");
                februar[i][s] = IO.readInteger();
            }
        }
        int[][] summe = new int[januar.length][januar[0].length];
        for (int i = 0; i < summe.length; i++) {
            for (int s = 0; s < summe[i].length; s++) {
                System.out.print(summe[i][s] + "\t");
            }
            System.out.println();
        }
        int[] zeilensummen = new int[summe.length];
        for (int i = 0; i < summe.length; i++) {
            for (int s = 0; s < summe[i].length; s++) {
                zeilensummen[i] = zeilensummen[i] + summe[i][s];
            }
        }
        System.out.println("Zeilensummen: ");
        //IO.writeArray(zeilenSummen);

        int[] spaltenSummen = new int[summe[0].length];
        for (int i = 0; i < summe[0].length; i++) {
            for (int s = 0; s < summe.length; s++) {
                spaltenSummen[i] = spaltenSummen[i] + summe[s][i];
            }
        }
        System.out.println(spaltenSummen.length);
    }

}


