import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    /**
     * gibt BufferedReader in der Konsole "Text"
     *
     * @return Text eingabe
     * @throws IOException
     */

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        return eingabe;

        
    }

    /**
     * Liest eine ganze Zahl von der Konsole
     *
     * @return Die eingelesene ganz Zahl
     * @throws IOException
     */
    public static int readInteger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        return a;
    }


    /**
     * liese eine kommazahl von der konsole
     *
     * @return Die eingelesene Kommazahl
     * @throws IOException
     */
    public static double readDouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {

                double eingabe = Double.parseDouble(br.readLine().replace(',', '.'));
                return eingabe;
            } catch (NumberFormatException a) {
                System.out.println("ungültige Eingabe. Bitte erneut versuchen: ");
            }
        }
    }

    /**
     * Wiederholt den Programm
     *
     * @return to while
     * @throws IOException
     */

    public static boolean readBoolean() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String rmpEingabe = br.readLine().trim();
            if (rmpEingabe != null) {

                if (rmpEingabe.equalsIgnoreCase("JA")
                        || rmpEingabe.equalsIgnoreCase("J")
                        || rmpEingabe.equalsIgnoreCase("y")
                        || rmpEingabe.equalsIgnoreCase("yes")) {
                    return true;


                } else if (rmpEingabe.equals("NEIN")
                        || rmpEingabe.equalsIgnoreCase("N")
                        || rmpEingabe.equalsIgnoreCase("nein")) {
                    return false;


                }

                System.out.println("Nochmal");

            }

        }
    }

    /**
     * Mehrere eingaben möglischkeit
     *
     * @return liste
     * @throws IOException
     */
    public static int[] readintegerArray(int anzahl) throws Exception {

        int[] liste = new int[anzahl];

        for (int i = 0; i < liste.length; i++) {

            System.out.println("Wert " + (i + 1) + ": ");

            liste[i] = readInteger();

        }

        return liste;

    }

}










