package Tresor;

public class TestProgramm {
    public static void main(String[] args) throws GegenstandNichtGefundenException {

        // Tresor + Inhaber erstellen
        Tresor tresor = new Tresor();
        // Gegenstände erstellen
        Schmuck s1 = new Schmuck(1, 500, "Goldtaler von Dagobert Duck");
        Schmuck s2 = new Schmuck(2, 150, "Halskette von Daisy Duck");
        Aktie a1 = new Aktie(11, 100, "Entenhausen AG", 1);
        Aktie a2 = new Aktie(12, 500, "Walt Disney AG", 50);

        // Tresor befüllen
        tresor.addGegenstand(s1);
        tresor.addGegenstand(s2);
        tresor.addGegenstand(a1);
        tresor.addGegenstand(a2);

        // Tresorinhalt ausgeben
        System.out.println(tresor);

        // Gegenstände entfernen und ausgeben --> Exception fangen
        System.out.println("---------------------\nWalt Disney Aktie (a2) entfernen");
        tresor.removeGegenstand(a2);

        System.out.println("---------------------\nWalt Disney Aktie (a2) suchen:\n");
        try {
            tresor.getGegenstand(a2.getId());
            System.out.println("Aktie noch da!");
        } catch (GegenstandNichtGefundenException e) {
            System.out.println(e.getMessage());
        }

        // Tresorinhalt nocheinmal ausgeben
        //System.out.println(tresor);

        //System.out.println("\n---------------------\nWalt Disney Aktie (a2) ausgeben auf Konsole:\n");
        //System.out.println(a2);
    }
}
