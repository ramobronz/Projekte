import java.io.IOException;

public class schaltJahre {
    public static void main(String[] args) throws IOException {
        System.out.println("Schaltjahr Rechner");
        do {
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("bei Welchem Jahr soll ihre berchnung starten?");
            int start = IO.readInteger();
            System.out.println("bis welchem Jahr soll ihre berchnung enden?");
            int ende = IO.readInteger();

            for (int i = start; i <= ende; i++) {
                if (i% 4 == 0 && (i% 100 != 0 || i% 400 == 0)) {
                    System.out.println(i + " - ist eine Schaltjahr");

                if (start<ende){
                    System.out.println("ERROR");
                }
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("nochmal rechnen?");
        } while (IO.readBoolean());
    }
}
