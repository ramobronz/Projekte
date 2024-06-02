import java.io.IOException;
import java.util.Objects;

class Kino {
    static String[][] saal;

    public static void main(String[] args) throws IOException {
        erzeugenSaal();
        anzeigenSaal();
        reservierenPlatz();
        anzeigenSaal();
        wiederholen();
    }

    private static void erzeugenSaal() throws IOException {

        System.out.print("Wie viel Reihen gibt es in Kinosaal: ");
        int lange = IO.readInteger();
        System.out.print("Wie viel Plätze gibt es pro Reihe: ");
        int breit = IO.readInteger();
        saal = new String[lange][breit];
        for (int i = 0; i < lange; i++) {
            for (int j = 0; j < breit; j++) {
                saal[i][j] = "O  ";
            }
        }
    }

    private static void anzeigenSaal() {
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                System.out.print(saal[i][j]);
            }
            System.out.println();
        }
    }


    private static void reservierenPlatz() throws IOException {
        System.out.println("in Welche Reihe willst du Reservieren:");
        int reihe = IO.readInteger() - 1;
        if (reihe + 1 > saal.length) {
            System.out.println("diese Reihe gibt es nicht");
            System.out.println(" ");
            return;
        }
        System.out.println("Welchen Platz willst du Reservieren: ");
        int plaetze = IO.readInteger() - 1;
        if (plaetze + 1 > saal.length) {
            System.out.println("diesen Platz gibt es nicht");
            System.out.println(" ");
            return;
        }
        if (Objects.equals(saal[reihe][plaetze], "X  ")) {
            System.out.println(" ");
            System.out.println("Dieser Platz wurde schon Reserviert! ");
            System.out.println("bitte such dir einen anderen Platz");
            System.out.println(" ");
            return;
        } else {
            System.out.println("Du hast diesen Platz Reserviert ");
            saal[reihe][plaetze] = "X  ";
            System.out.println("Du hast die Reihe " + (reihe + 1) + " Platz " + (plaetze + 1) + " reserviert");
            System.out.println(" ");
        }

    }

    private static void stornierenPlatz() throws IOException {

        System.out.println("Welche Reihe willst du stornieren:");
        int reihe = IO.readInteger() - 1;
        if (reihe + 1 > saal.length) {
            System.out.println("diese Reihe gibt es nicht");
            System.out.println(" ");
            return;
        }
        System.out.println("Welchen Platze willst du stornieren: ");
        int plaetze = IO.readInteger() - 1;
        if (plaetze + 1 > saal.length) {
            System.out.println("diesen Platz gibt es nicht");
            System.out.println(" ");
            return;
        }
        if (saal[reihe][plaetze].equalsIgnoreCase("O  ")) {
            System.out.println("dieser Platz ist schon Frei");
            System.out.println(" ");
            return;
        } else {
            System.out.println(" ");
            saal[reihe][plaetze] = "O  ";
            System.out.println("Du hast die Reihe " + (reihe + 1) + " Platz " + (plaetze + 1) + " stoniert");
        }

    }

    private static void wiederholen() throws IOException {
        do {
            System.out.println("möchten Sie weitere resevierungen oder einen Platz stonieren?");
            System.out.println("r= resevieren");
            System.out.println("s= stonieren");
            String wider = IO.readString();
            if (wider.equals("r")) {
                anzeigenSaal();
                reservierenPlatz();
                anzeigenSaal();
            }
            if (wider.equals("s")) {
                anzeigenSaal();
                stornierenPlatz();
                anzeigenSaal();
            }

            System.out.println(" ");
            System.out.println("Willst du weiter resavieren oder stonieren?");
            System.out.println("* Ja oder nein *");
        } while (IO.readBoolean());
        System.out.println(" ");
        anzeigenSaal();
        System.out.println(" ");
        System.out.println("Vielen Dank für deine Reservierung");

    }
}