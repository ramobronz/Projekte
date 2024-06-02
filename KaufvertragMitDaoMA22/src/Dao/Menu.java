package Dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.io.IOException;
import java.sql.SQLException;

public class Menu {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VertragspartnerDaoMa22 vertragspartnerDaoMa22 = new VertragspartnerDaoMa22();
        boolean r = true;

        System.out.println();
        System.out.print("Vertragspartner (v) oder Ware (w) / Schließen (b): ");
        String auswahl = IO.readString();
        System.out.println();
        if (auswahl.equalsIgnoreCase("b")) {
            System.out.println("danke");
            return;
        }
        while (r) {
            if (auswahl.equalsIgnoreCase("v")) {
                System.out.println("Wählen Sie ein von diese befehle");
                System.out.println("read: liest eine bestimmte Vertragspartner");
                System.out.println("readall: zeigt dir alle verfügbare Vertragspartner");
                System.out.println("delete: löscht eine Vertrags partner nach deiner Auswahl");
                System.out.println("creat: erstellt eine Vertragspartner");
                System.out.println("update: bearbeitet eine Vertragspartner deiner Auswahl");
                System.out.println("  ");
                System.out.println("Meiner Wahl");
                String auswahlv = IO.readString();

//read
                if (auswahlv.equalsIgnoreCase("read")) {
                    System.out.print("wie lautet der AusweisNr: ");
                    String ausweisNr = IO.readString();
                    vertragspartnerDaoMa22.read(ausweisNr);
                    System.out.println(vertragspartnerDaoMa22.read(ausweisNr));

                }
//Array
                if (auswahlv.equalsIgnoreCase("readall")) {
                    System.out.println("Aktuelle Vertragspartner");
                    System.out.println(vertragspartnerDaoMa22.readall());
                }

//delete
                if (auswahlv.equalsIgnoreCase("delete")) {
                    System.out.print("Wähle bitte die AusweisNr: ");
                    String ausweis = IO.readString();
                    vertragspartnerDaoMa22.delete(ausweis);
                    System.out.println(vertragspartnerDaoMa22);
                    System.out.println("würde gelöscht");
                    System.out.println("-------------------------------");
                    System.out.println("Hier ist eine Überblick über die geblibene Daten: ");
                    System.out.println(vertragspartnerDaoMa22.readall());

                }
//erstellen

                if (auswahlv.equalsIgnoreCase("creat")) {
                    System.out.println("\nVertragspartner erstellen");
                    System.out.println(" ");
                    System.out.print("Vorname: ");
                    String vorname = IO.readString();
                    System.out.print("Nachname: ");
                    String nachname = IO.readString();
                    Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);
                    System.out.print("Geb bitte AusweisNr ein: ");
                    String ausweis = IO.readString();
                    vertragspartner.setAusweisNr(ausweis);

                    System.out.println("geben Sie Adresse ein: ");
                    System.out.print("Strasse: ");
                    String strasse = IO.readString();
                    System.out.print("HausNr: ");
                    String hausnr = IO.readString();
                    System.out.print("Plz: ");
                    String plz = IO.readString();
                    System.out.print("Ort: ");
                    String ort = IO.readString();
                    Adresse adresse = new Adresse(strasse, hausnr, plz, ort);
                    vertragspartner.setAdresse(adresse);
                    vertragspartner = vertragspartnerDaoMa22.create(vertragspartner);
                    System.out.println(vertragspartner);
                }

                System.out.println(" ");
                System.out.println("Erfolgreich erstellt!!");

//Update

                if (auswahlv.equalsIgnoreCase("update")) {
                    System.out.print("wähle bitte eine AusweisNr: ");
                    String ausweis = IO.readString();
                    vertragspartnerDaoMa22.read(ausweis);
                    System.out.println("Der Vertragspartner");
                    System.out.println(vertragspartnerDaoMa22.read(ausweis));
                    System.out.print("was möchtest du ändern: ");
                    System.out.println("vorname | nachname | adresse");
                    String wahl = IO.readString();

                    if (wahl.equalsIgnoreCase("vorname")) {
                        Vertragspartner vertragspartner = vertragspartnerDaoMa22.read(ausweis);
                        System.out.print("Wähle eine neue Vorname: ");
                        String vornameneu = IO.readString();
                        vertragspartner.setVorname(vornameneu);
                        vertragspartnerDaoMa22.update(vertragspartner);
                        System.out.println("Update Erfolgreich");
                        System.out.println(vertragspartnerDaoMa22.read(ausweis));
                    }

                    if (wahl.equalsIgnoreCase("nachname")) {
                        Vertragspartner vertragspartner = vertragspartnerDaoMa22.read(ausweis);
                        System.out.print("wähle eine neue Nachname: ");
                        String nachnameneu = IO.readString();
                        vertragspartner.setNachname(nachnameneu);
                        vertragspartnerDaoMa22.update(vertragspartner);
                        System.out.println("Update Erfolgreich");
                        System.out.println(vertragspartnerDaoMa22.read(ausweis));
                    }

                    if (wahl.equalsIgnoreCase("adresse")) {
                        Vertragspartner vertragspartner = vertragspartnerDaoMa22.read(ausweis);
                        System.out.print("wähle eine neue strasse: ");
                        String strasseneu = IO.readString();
                        System.out.print("wähle eine neue HausNr: ");
                        String hausnrneu = IO.readString();
                        System.out.print("wähle eine neue plz: ");
                        String plzneu = IO.readString();
                        System.out.print("wähle eine neue ort: ");
                        String ortneu = IO.readString();
                        Adresse adresse = new Adresse(strasseneu, hausnrneu, plzneu, ortneu);
                        vertragspartner.setAdresse(adresse);
                        vertragspartnerDaoMa22.update(vertragspartner);
                        System.out.println("Update Erfolgreich");
                        System.out.println(vertragspartnerDaoMa22.read(ausweis));
                    }
                }
            }
        }
    }
}