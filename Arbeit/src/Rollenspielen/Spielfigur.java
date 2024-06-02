package Rollenspielen;

public abstract class Spielfigur {
    private String name;
    private int staerkepunkte;


    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    public void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() {
        staerkepunkte += 10;
        System.out.println(name + " isst und gewinnt 10 Stärkepunkte dazu.");
    }

    public void laufen() {
        if (staerkepunkte >= 1) {
            staerkepunkte--;
            System.out.println(name + " läuft.");
        } else {
            System.out.println(name + " ist zu schwach zum Laufen.");
        }
    }

    public void klettern() {
        if (staerkepunkte >= 2) {
            staerkepunkte -= 2;
            System.out.println(name + " klettert.");
        } else {
            System.out.println(name + " ist zu schwach zum Klettern.");
        }
    }

    public void kaempfen() {
        if (staerkepunkte >= 3) {
            staerkepunkte -= 3;
            System.out.println(name + " kämpft.");
        } else {
            System.out.println(name + " ist zu schwach zum Kämpfen.");
        }
    }

    @Override
    public String toString() {
        return "\n\t" +
                "Name: " + name + "\n\t" +
                "Stärkepunkte " + staerkepunkte + "\n\t";
    }
}
