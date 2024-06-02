import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class IO_Test {

    public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           System.out.println("wie heißen Sie: ");
           String name = IO.readString();
           System.out.println("Hallo " + name + "!");

           System.out.println("wie alt sind Sie");
           int alter = IO.readInteger();
           System.out.println("Sie sind " + alter + " Jahre");


           System.out.println("wie groß sind Sie cm");
           System.out.println("Sie sind " + IO.readDouble() + "cm groß");


           System.out.print("wiederholen? ");
           IO.readBoolean();


    }



}
