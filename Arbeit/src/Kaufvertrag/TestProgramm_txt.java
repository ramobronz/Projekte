package Kaufvertrag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class TestProgramm_txt {

    public static void main(String[] args) throws FileNotFoundException {
        // businessobjects.Ware anlegen.
        Ware ware = new Ware("Laptop", 250.0);
        ware.setBeschreibung("Supe" +
                " krasses Gaming-Laptop");
        ware.getBesonderheiten().add("Tasche");
        ware.getBesonderheiten().add("Gaming-Maus");
        ware.getMaengel().add("Ladekabel fehlt");
        ware.getMaengel().add("Touchpad defekt");
        // Käufer anlegen.
        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));
        // Verkäufer anlegen.
        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));
        // businessobjects.Kaufvertrag anlegen.
        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        kaufvertrag.setZahlungsModalitaeten("Privater Barverkauf");
        // businessobjects.Kaufvertrag ausgeben.
        String datei = "C:\\Users\\alraj\\IdeaProjects\\MA22LF01\\Arbeit\\src\\Kaufvertrag\\Dateien\\Kaufvertrag.txt";
        PrintWriter text = new PrintWriter(datei);
        text.println(kaufvertrag);
        text.close();
    }
}
