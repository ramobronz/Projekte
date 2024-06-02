package Fussball;

public class SpielAbbruchException extends Exception {

    private int spielMinute;

    public SpielAbbruchException(int spielMinute) {
        super();
        this.spielMinute = spielMinute;
    }

    public int getSpielMinute() {
        return spielMinute;
    }

    @Override
    public String getMessage() {
        return "Spielabbruch in Minute " + spielMinute;
    }
}
