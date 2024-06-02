import java.io.IOException;

public class Maxima {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben Sie ein Array kommazahlen ein:");
        System.out.println("wie viele Werte?");
        int werte= IO.readInteger();
        int wert1[]= new int[werte];

        for (int i= 0; i<wert1.length; i++){
            System.out.print("wert " + (i+1) + "eingeben: ");
            double eingabe= IO.readDouble();
        }
            double max=0;
            double max1=0;
            if (wert1[0]>wert1[1]){
                max= wert1[0];
                max1=wert1[1];
            }else {
                max=wert1[1];
                max1=wert1[0];
            }
            for (int i= 2; i<wert1.length; i++){
                if (wert1[i]>max1){
                    max1= max;
                    max=wert1[i];
                }
                else if (wert1[i] > max1){
                    max1= wert1[i];
                }
            }
        System.out.println(max);
    }
}
