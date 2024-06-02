package Fussball;

public class Ergebnis {

    private int heimmannschaft;
    private int gastmannschaft;

    public Ergebnis(int heimmannschaft, int gastmannschaft) {
        this.heimmannschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
    }

    public int getHeimmannschaft() {
        return heimmannschaft;
    }

    public int getGastmannschaft() {
        return gastmannschaft;
    }

    public void heimtor() {
        this.heimmannschaft++;
    }

    public void gasttor() {
        this.gastmannschaft++;
    }

    @Override
    public String toString() {
        return "Spiel Tore: " + "\n\t" +
                "Heimmannschaft=" + heimmannschaft + "\n\t" +
                "Gastmannschaft=" + gastmannschaft + "\n\t";
    }
}
