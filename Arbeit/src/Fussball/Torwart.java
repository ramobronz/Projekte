package Fussball;

public class Torwart extends Spieler {

    private int reaktion;

    public Torwart(String name, int alter, int staerke, int motivation,int reaktion) {

        super(name, alter, staerke, 0, motivation, 0);

        this.reaktion=reaktion;

    }



    public int getReaktion() {

        return reaktion;

    }



    public void setReaktion(int reaktion) {

        this.reaktion = reaktion;

    }



    @Override

    public String toString() {

        return "Eigen.Torwart:" +"\n" +

                "\t"+"Name=" + getName()+ "\n" +

                "\t"+ "Alter=" + getAlter() +"\n" +

                "\t"+"Staerke=" + getStarke() +"\n" +

                "\t"+ "Motivation=" + getMotivation() +"\n" +

                "\t"+"Reaktion=" + reaktion+ "\n";

    }

}