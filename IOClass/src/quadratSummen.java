import java.io.IOException;

public class quadratSummen {
    public static void main(String[] args) throws IOException, IOException {
        System.out.println("willkommen in der Quadratsummen rechner");
        System.out.println("geben sie ein bis welche Zahl Sie quadrarieren möchten");
        int a = IO.readInteger();

        while (a > 0) {
            System.out.println(a + " hoch 2 ist " + Math.pow(a, 2));
            a--;
        }
    }

}

