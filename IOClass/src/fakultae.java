import java.io.IOException;

public class fakultae {
    public static void main(String[] args) throws IOException {
        System.out.println("Fakultät von 1-10");
        System.out.println("----------------------------");
        int i;
        int ergebnis = 1;
        int countdown = 1;
        for (i = 1; i <= 10; i++) {
            ergebnis = ergebnis * i;
            System.out.println("Die Fakultaet von " + countdown + " ist: " + ergebnis + ".");


        }


    }
}



