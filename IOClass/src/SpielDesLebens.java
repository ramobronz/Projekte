import java.io.IOException;

public class SpielDesLebens {
    public static void main(String[] args) throws IOException {
        erzeugenReihe();
        anzeigenReihe();
        einsetzen();
        anzeigenReihe();
    }

    static String[][] reihe;

    private static String[][] erzeugenReihe() throws IOException {
        System.out.print("wie bereit ist die Reihe? ");
        int bereit = IO.readInteger();
        System.out.print("wie lange ist das spielfeld? ");
        int lange = IO.readInteger();
        reihe = new String[bereit][lange];
        for (int i = 0; i < bereit; i++) {
            for (int j = 0; j < lange; j++) {
                reihe[i][j] = "[ ]";
            }
        }
        return reihe;
    }

    private static void anzeigenReihe() {
        for (int i = 0; i < reihe.length; i++) {
            for (int j = 0; j < reihe[i].length; j++) {
                System.out.print(reihe[i][j]);
            }
            System.out.println();
        }
    }

    private static void einsetzen() throws IOException {
        System.out.println("in welche reihe möchten Sie ihre Spieler hinsetzen");
        int reihe1 = IO.readInteger() - 1;
        System.out.println("in welche platz möchten Sie ihre Spieler setzten?");
        int platz = IO.readInteger() - 1;
        reihe[reihe1][platz] = "[O]";
    }

}
