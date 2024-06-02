package Tresor;

public class GegenstandNichtGefundenException extends Exception {
    private int id;

    public GegenstandNichtGefundenException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return "Gegenstand mit ID " + id + " konnte nicht gefunden werden.";
    }

}
