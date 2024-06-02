import java.io.IOException;

public class wurzel {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("von welche Zahl möchten Sie rechnen? ");
            double a = IO.readDouble();
            System.out.println("bis welche Zahl möchten Sie rechnen?");
            double i = IO.readDouble();
            if (a >= i) {
                while (a >= i) {
                    double b = Math.sqrt(i);
                    System.out.println("coutdown " + i + " ----------- und wurzel davon ist= " + b);
                    ++i;
                    ++b;
                }
            } else if (a <= i) {
                while (a <= i) {
                    double b = Math.sqrt(i);
                    System.out.println("updown " + i + " ----------- und wurzel davon ist= " + b);
                    --i;
                    --b;

                }
            }
            System.out.println("nochmal? ");
        } while (IO.readBoolean());
    }
}
