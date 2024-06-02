package Rollenspielen;

public class Zauberer extends Spielfigur {

    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {
        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;

    }

    public void trinkenZaubertrank() {
        zauberpunkte += 3;
        System.out.println(getName() + " trinkt einen Zaubertrank und gewinnt 3 Zauberpunkte dazu.");
    }

    public void zaubern() throws KeineKraftException {
        if (zauberpunkte >= 1) {
            zauberpunkte--;
            System.out.println(getName() + " zaubert.");
        } else {
            throw new KeineKraftException(getName(), " hat nicht genug Zauberpunkte zum Zaubern.");
        }
    }

    @Override
    public String toString() {
        return "Zauberer: " + "\n\t" +
                "Name " + getName() + "\n\t" +
                "Zauberer Punkte: " + zauberpunkte;
    }
}
