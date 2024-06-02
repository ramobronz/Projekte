import java.io.IOException;
import java.text.DecimalFormat;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {
        DecimalFormat df=new DecimalFormat("#,##0.00€");
        DecimalFormat df1= new DecimalFormat("0.00");
      do {


        System.out.println("geben Sie das kapital");
        double kapital=IO.readDouble();
        System.out.println("bitte den Zinssatz geben");
        double zins= IO.readDouble();
        System.out.println("die Laufzeit in Jahren geben");
        int jahre= IO.readInteger();

        System.out.print("Jahre " + "  Kapital" + "         Zisen\t" + " Jahresendbetrag");
          System.out.println("");
          System.out.println("-------------------------------------------------");
        for (int i= 1; i <= jahre ; i++){
            double r = (kapital*zins/100)*100/100.;
            double rechnung=(kapital+r);
            System.out.println("");
            System.out.println(i + ":\t    "+ df.format(kapital) + ":\t    " + df1.format(r) +"%"+ "\t    " + df.format(rechnung));
            kapital=(rechnung);
        }
          System.out.println("");
          System.out.println("wollen Sie noch ein weitere Rechnung durchführen");
      }while (IO.readBoolean());
    }
}
