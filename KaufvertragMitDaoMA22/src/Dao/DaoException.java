package Dao;

public class DaoException extends Exception {
    private String message;
    private String message2;

    /**
     * Konstruktor
     *
     * @param message Der Fehlertext
     */
    public DaoException(String message) {
        super();
        this.message = message;
        this.message = message2;
        message = "Doppelte Ausweisnummer. ";
        message2 = "Dieser Ausweisnr ist leider nicht vorhandln";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
    public String getMessage2(){return this.message2;}
}
