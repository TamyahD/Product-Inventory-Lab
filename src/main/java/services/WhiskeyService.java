package services;

import models.Product;
import models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService implements ProductService{
    private static int nextId=100;
    private List<Whiskey> whiskeyInventory = new ArrayList<>();


    public Whiskey create(String brand, String itemName,
                          Double price, int id, Integer stock) {
        if (whiskeyInventory.size()==0) {
            nextId=100;
        }
        Whiskey createdWhiskey = new Whiskey(brand, itemName, price, nextId++, stock);
        whiskeyInventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public List<Whiskey> getWhiskeyInventory() {
        return whiskeyInventory;
    }

    public void setWhiskeyInventory(List<Whiskey> whiskeyInventory) {
        this.whiskeyInventory = whiskeyInventory;
    }


    @Override
    public Product findProduct(int id) {
        return null;
    }

    @Override
    public Product[] findAll() {
        return new Product[0];
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
