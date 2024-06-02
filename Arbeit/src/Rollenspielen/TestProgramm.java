package Rollenspielen;


public class TestProgramm {
    public static void main(String[] args) {
        // Spielfigur figur = new Spielfigur("Normalo", 10);
        Zauberer kannNix = new Zauberer("kannNix", 0, 0);
        try {
            kannNix.zaubern();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }
        kannNix.trinkenZaubertrank();
        System.out.println(kannNix);
        try {
            kannNix.zaubern();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(kannNix);

        /**************************************************************/
        Zauberer merlin = new Zauberer("Merlin", 10, 3);
        merlin.setStaerkepunkte(0);
        merlin.laufen();

        merlin.laufen();
        merlin.klettern();
        merlin.kaempfen();
        merlin.kaempfen();
        System.out.println("Merlin hat noch " + merlin.getStaerkepunkte()
                + " Stärkepunkte.");
        merlin.kaempfen();

        merlin.setStaerkepunkte(5);
        System.out.println("Merlin hat noch " + merlin.getStaerkepunkte() + " Stärkepunkte.");
        merlin.kaempfen();

        try {
            merlin.zaubern();
            merlin.zaubern();
            merlin.zaubern();
            System.out.println("Merlin hat noch " + merlin.getZauberpunkte()
                    + " Zauberpunkte.");
            merlin.zaubern();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }

        /***********/
        System.out.println("-----------------------------------");
        Elfe flitzer = new Elfe("Flitzer", 5);
        System.out.println(flitzer);
        flitzer.rennen();
        flitzer.rennen();
        System.out.println(flitzer);
        flitzer.rennen();

        /***********/
        System.out.println("-----------------------------------");
        Zauberer gandolf = new Zauberer("Gandolf", 10, 2);
        gandolf.laufen();
        gandolf.klettern();
        gandolf.klettern();
        System.out.println("Gandolf hat noch " + gandolf.getStaerkepunkte()
                + " Stärkepunkte.");
        gandolf.kaempfen();
        gandolf.kaempfen();

        // Der Aufruf klappe, trotz protected
        // Java interpretiert protected als package
        // Genau dieser Aufruf sollte damit vermieden werden!!
        gandolf.setStaerkepunkte(5);
        System.out.println("Gandolf soll gestärkt werden");
        System.out.println(gandolf);
    }

}

//package Rollenspielen;

//public class TestProgramm {
//  public static void main(String[] args) {

//     Zauberer zauberer = new Zauberer("Bobo", 10, 10);
//       try {
//           zauberer.zaubern();
//       } catch (KeineKraftException e) {
//           System.out.println(e.getMessage());
//       }
//       zauberer.trinkenZaubertrank();
//       System.out.println(zauberer);
//       try {
//           zauberer.zaubern();
//       } catch (KeineKraftException e) {
//           System.out.println(e.getMessage());
//       }
//       System.out.println(zauberer);
//}
//}
//Zauberer zauberer = new Zauberer("aha", 10, 5);
// System.out.println(zauberer);
// Elfe elfe = new Elfe("mo", 5);
// System.out.println(elfe);
//KeineKraftException keineKraftException = new KeineKraftException("new ", "S");
// System.out.println(keineKraftException);