package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId=1;
    private List<Sneaker> sneakerInventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport,
                                 Double size, Integer stock, Double price) {

        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, stock, price);
        sneakerInventory.add(createdSneaker);
        return createdSneaker;
    }
}
