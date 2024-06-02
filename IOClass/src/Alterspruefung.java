import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie alt sind Sie? ");

            int zahl = IO.readInteger();
            boolean mind = (zahl <= 17);
            // if(zahl <= 17) {
            //    mind = true;
            // }
            boolean max = (zahl >=18);
        String s = Integer.toString(zahl);


        if (mind == true) {
            System.out.println("Sie sind minderjährig");
        }

        else if  ( max == true) {
            System.out.println("Sie sind volljährig");
        }

    }
}
