import java.io.IOException;

public class Wuerfeln_Mohammad_Alrajab {
    static int[][] beide;
    static int[] max;

    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen bei der Wüfelexperemente");
        experiment();

    }

    private static void experiment() throws IOException {
        System.out.print("wie viel Experimente wollen Sie: ");
        int exper = IO.readInteger();
        System.out.print("Wie viel würfe möchten Sie: ");
        int wurf = IO.readInteger();
        beide = new int[exper][wurf];
        int[][] zahl = new int[exper][wurf];
        int n[] = new int[wurf];
        int summe = 0;
        int m = 0;
        for (int i = 0; i < beide.length; i++) {
            for (int j = 0; j < beide[i].length; j++) {
                System.out.print("experment " + (i + 1) + " wurf " + (j + 1) + ": ");
                beide[i][j] += IO.readInteger();
                summe += beide[i][j];


            }

        }
        int[] ah = new int[0];
        for (int i = 0; i < beide.length; i++) {
            for (int j = 0; j < beide[i].length; j++) {
                max = new int[]{Math.max(wurf, n[i])};
            }

        }
        double ma = 0;
        for (int i = 0; i < beide.length; i++) {
            ma = summe + beide[i][0];
        }
        System.out.println("gesammt gewürfelt: " + summe);
        System.out.println("Das Maximum beträgt " + max.length);
        System.out.println("Das Mitellwert beträgt: " + ma / beide.length);


    }

    public static double arithmetischesMittel(double[] zahl) {
        double summe = 0;
        for (int i = 0; i < zahl.length; i++) {
            summe = summe + zahl[i];
        }
        double arithmetischesMittel = summe / zahl.length;
        return arithmetischesMittel;
    }

}







