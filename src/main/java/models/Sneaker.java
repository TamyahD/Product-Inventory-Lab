package models;


public class Sneaker extends Product {
    private String brand;
    private String sport;
    private Double size;


    public Sneaker(String brand, String itemName, Double price, Integer id, Double size, Integer stock) {
        super(itemName, price, id, stock);
        this.brand = brand;
        this.size = size;
    }

    public Sneaker(String itemName, Double price, Integer id, Integer stock) {
        super(itemName, price, id, stock);
    }

    public Sneaker(String itemName, Double price, Integer id) {
        super(itemName, price, id);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }


}
