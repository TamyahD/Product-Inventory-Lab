package models;


public class Sneaker extends Product {
    public Sneaker(String itemName, Double price, String id, Integer stock) {
        super(itemName, price, id, stock);
    }

    public Sneaker(String itemName, Double price, String id) {
        super(itemName, price, id);
    }
}
