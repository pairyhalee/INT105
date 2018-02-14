package sit.model;

public class Juice extends Water {
    private double perOfVitamin;

        public Juice(String brand, int price,double perOfVitamin) {
        super(brand, price);
        this.perOfVitamin=perOfVitamin;
    }

    public double getPerOfVitamin() {
        return perOfVitamin;
    }

    public void setPerOfVitamin(double perOfVitamin) {
        this.perOfVitamin = perOfVitamin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString()+ "Juice{" + "perOfVitamin=" + perOfVitamin + '}';
    }
    @Override
    public boolean equals(Object obj){
        Juice temp;
        if (obj != null && obj instanceof Juice) {
          temp = (Juice)obj;
          if( perOfVitamin == temp.perOfVitamin)
              return true;
    }
        return false;
    }
}