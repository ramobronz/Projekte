import java.io.IOException;
import java.text.DecimalFormat;

public class Temperaturmessungen {
    public static void main(String[] args) throws IOException {
        DecimalFormat bf= new DecimalFormat("0.00°");
        System.out.println("Bitte geben Sie die Tempratur an Tag 1 ein:");
        double t1= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 2 ein:");
        double t2= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 3 ein:");
        double t3= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 4 ein:");
        double t4= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 5 ein:");
        double t5= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 6 ein:");
        double t6= IO.readDouble();
        System.out.println("Bitte geben Sie die Tempratur an Tag 7 ein:");
        double t7= IO.readDouble();

        System.out.println("");
        double rechnung= (t1+t2+t3+t4+t5+t6+t7)/7;
        System.out.println("Der Mittelwert beträgt: " + bf.format(rechnung));
        double i= Math.max(t1, Math.max(t2, Math.max(t3, Math.max(t4, Math.max(t5, Math.max(t6, t7))))));
        System.out.println("Die maximale Tempratur beträgt: " + i + "°");

    }
}
