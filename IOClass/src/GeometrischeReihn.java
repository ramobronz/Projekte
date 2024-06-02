import java.io.IOException;

public class GeometrischeReihn {
    public static void main(String[] args) throws IOException {
        System.out.println("willkommen in ihre Germotrische Reihe");
        System.out.println("geben Sie n ein");
        int n = IO.readInteger();
        int a = 0;

        while (n > a) {
            n += n * n;
            System.out.println(n);

        }
    }
}


