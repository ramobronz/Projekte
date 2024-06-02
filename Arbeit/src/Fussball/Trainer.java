package Fussball;

public class Trainer extends Person{

    private Integer erfahrung;



    public Trainer(String name, int alter, int erfahrung) {
        super(name,alter);
        this.erfahrung = erfahrung;

    }


  public Integer getErfahrung(){
        return erfahrung;
  }

  public void setErfahrung(int erfahrung){
        this.erfahrung=erfahrung;
  }

    @Override
    public String toString() {
        return "Eigen.Trainer{" + "\n" +
         "name=" + getName() + "\n" +
                "alter=" + getAlter() + "\n" +
                ", erfahrung=" + erfahrung +
                '}';
    }
}
