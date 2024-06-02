package Kaufvertrag;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgrammReasCSV {
    public static void main(String[] args) throws IOException {
        LeseCsv();
    }

    private static void LeseCsv() throws IOException {
        String datei = "C:\\Users\\alraj\\IdeaProjects\\MA22LF01\\Arbeit\\src\\Kaufvertrag\\Dateien\\Kaufvertrag1.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));

        //Datei auslesen
        String zeile;
        while ((zeile = br.readLine()) != null) {
            String[] array = zeile.split(";");
            for (String element : array) {
                System.out.println(element);
            }
        }

    }
}
