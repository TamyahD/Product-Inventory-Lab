package models;

public class Whiskey extends Product{
    public Whiskey(String itemName, Double price, String id, Integer stock) {
        super(itemName, price, id, stock);
    }

    public Whiskey(String itemName, Double price, String id) {
        super(itemName, price, id);
    }
}
