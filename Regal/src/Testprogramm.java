public class Testprogramm {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("ladestrasse", "1", "28259", "Bremen");
        Lagerhalle lg1 = new Lagerhalle("Lagerhalle 95", adresse1);

        Regal regal = new Regal(lg1);

        Kiste kiste1 = new Kiste("1", 5, 50, 109, 5, 5, 5);
        ;
        Tonne tonne1 = new Tonne("3", 23, 23, 32, 43, 4);

        regal.addBehaelter(kiste1);
        regal.addBehaelter(tonne1);
        System.out.println(regal);
        System.out.println(lg1);
        System.out.println(lg1 + "\n" + regal);
    }
}