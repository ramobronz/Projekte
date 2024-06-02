package Zahlensysteme;

import java.io.IOException;

public class KonverterDezimal2Dua {
    public static void main(String[] args) throws IOException {
        do {

            System.out.print("gib eine ganze Zahl ein: ");
            int dezimal = IO.readInteger();
            //String für aufzubauende Dualuahl
            String dual = " ";

            int dezimalneu = dezimal;

            while (dezimalneu > 0) {
                int rest = dezimalneu % 2;
                dual = rest + dual;
                dezimalneu = (dezimalneu - rest) / 2;
            }
            System.out.println("Ihre Binearzahl lautet:");
            System.out.println("-----------------------");
            System.out.println("[  " + dual + "  ]");
            System.out.println(" ");
            System.out.println("möchten Sie noch ein weitere Rechnung durchführen? ");

        } while (IO.readBoolean());
    }
}
