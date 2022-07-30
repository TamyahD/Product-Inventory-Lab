package services;

import models.Product;
import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService implements ProductService{
    private static int nextId=1;
    private List<Sneaker> sneakerInventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport,
                                 Double size, Integer stock, Double price) {
        if (sneakerInventory.size()==0) {
            nextId=1;
        }
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, stock, price);
        sneakerInventory.add(createdSneaker);
        return createdSneaker;
    }

/*
    public Sneaker findSneaker(int id) {
        for (Sneaker sneak : sneakerInventory) {
            if (sneak.getId() == id) {
                return sneak;
            }
        }
        return null;
    }

    public Sneaker[] findAll() {
//        Sneaker[] sneakerArray = sneakerInventory.toArray(new Sneaker[0]);
        return sneakerInventory.toArray(new Sneaker[0]);
    }

    public boolean delete(int id) {
        for (Sneaker sneak : sneakerInventory) {
            Integer sneakerId = sneak.getId();
            if (sneak.getId()==id) {
                sneakerInventory.remove(sneak);
                return true;
            }
        }
        return false;
    }
*/

    public List<Sneaker> getSneakerInventory() {
        return sneakerInventory;
    }

    public void setSneakerInventory(List<Sneaker> sneakerInventory) {
        this.sneakerInventory = sneakerInventory;
    }

    @Override
    public Product findProduct(int id) {
        for (Sneaker sneak : sneakerInventory) {
            if (sneak.getId() == id) {
                return sneak;
            }
        }
        return null;
    }

    @Override
    public Product[] findAll() {
        return sneakerInventory.toArray(new Sneaker[0]);
    }

    @Override
    public boolean delete(int id) {
        for (Sneaker sneak : sneakerInventory) {
            Integer sneakerId = sneak.getId();
            if (sneak.getId()==id) {
                sneakerInventory.remove(sneak);
                return true;
            }
        }
        return false;
    }
}
