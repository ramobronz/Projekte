package Zahlensysteme;


import java.io.IOException;


public class ROT {

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Geben Sie den Text ein, den Sie verschlüsseln möchten: ");
            String input = IO.readString();
            String rot13 = rot13(input);
            System.out.println("Verschlüsselter Text: " + rot13);
            System.out.println(" ");
            System.out.println("Möchten Sie wiederholen:");
        } while (IO.readBoolean());
    }

    public static String rot13(String input) throws IOException {
        StringBuilder sb = new StringBuilder();
        System.out.print("geben Sie nach wie viel Sie die Buchtaben haben wollen: ");
        int eingabe = IO.readInteger();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') c += eingabe;
            else if (c >= 'A' && c <= 'M') c += eingabe;
            else if (c >= 'n' && c <= 'z') c -= eingabe;
            else if (c >= 'N' && c <= 'Z') c -= eingabe;
            sb.append(c);
        }
        return sb.toString();
    }
}