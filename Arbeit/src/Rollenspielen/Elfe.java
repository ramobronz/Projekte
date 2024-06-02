package Rollenspielen;

public class Elfe extends Spielfigur {

    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }

    public void rennen() {
        int rennen;
        rennen = getStaerkepunkte() - 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
