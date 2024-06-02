package Rollenspielen;

public class KeineKraftException extends Exception {
    private String aktion;
    private String name;

    public KeineKraftException(String aktion, String name) {
        super();
        this.aktion = aktion;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return name + " ist zu schwach zum " + aktion;
    }

    @Override
    public String toString() {
        return "KeineKraftException" + "\n\t" +
                "Aktion= " + aktion + "\n\t" +
                "Name= " + name + "\n\t";
    }
}
