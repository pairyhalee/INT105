package sit.model;

public class Water {
    private String brand;
protected int price;

    public Water() {
    }

    public Water(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Water{" + "brand=" + brand + ", price=" + price + '}';
    }

}