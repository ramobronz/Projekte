package Konto;

public class BetragNichtKorrektException extends Exception {
    public BetragNichtKorrektException(String getMessage) {
        super(getMessage);
    }

}
