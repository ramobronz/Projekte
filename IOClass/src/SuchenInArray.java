import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {
       do {


        System.out.println("Bitte geben Sie eon Array bestehend aus 5 Kommazahlen ein");
        double[] weahlen = new double[5];
        for (int i = 0; i < weahlen.length; i++) {
            System.out.print("welche Zahl ");
            weahlen[i] =IO.readDouble();

        }
        System.out.println("nach welche Zahl wollen Sie Suchen?");
        double eingabe = IO.readDouble();

        for (int i = 0; i < weahlen.length; i++){
            if (eingabe == weahlen[i]) {
                System.out.println("Treffer");

            }
            else if (eingabe != weahlen[i]){
                System.out.println("Niete");
            }
        }
           System.out.println("Wollen Sie es Wiederholen?");
    }while (IO.readBoolean());
}
}

