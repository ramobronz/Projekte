public class BehaelterNichtGefundenException extends Exception{
    private String behaelterNr;

    public BehaelterNichtGefundenException(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    @Override
    public String getMessage(){ return "behälter nicht gefunden mit der Nummer"+ behaelterNr;

    }
}

