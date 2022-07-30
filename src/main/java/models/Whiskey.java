package models;

public class Whiskey extends Product{
    String brand;

    public Whiskey(String brand, String itemName, Double price, int id, Integer stock) {
        super(itemName, price, id, stock);
        this.brand = brand;
    }
    public Whiskey(String itemName, Double price, int id, Integer stock) {
        super(itemName, price, id, stock);
    }

    public Whiskey(String itemName, Double price, int id) {
        super(itemName, price, id);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
