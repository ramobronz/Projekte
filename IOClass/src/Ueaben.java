import java.io.IOException;

public class Ueaben {
    public static void main(String[] args) throws IOException {
        System.out.println("hallo");
        int a= IO.readInteger();
        a=Math.max(a, 6);
        int b=IO.readInteger();
        b=Math.max(b, 6);

        int e = a+b;
        System.out.println(Math.max(e, 6 ));

    }
}
