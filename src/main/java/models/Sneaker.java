package models;

public class Sneaker extends Product {
    private String brand;
    private String sport;
    private Double size;

    //TODO add sport parameter
//    Sneaker s1 = new Sneaker("Nike", "Air Max 97", "running",
//                            120.00,1111197, 7.5, 21);
//    Sneaker s2 = new Sneaker("Adidas", "NMD R1", "running",
//                            150.00, 1111150, 8.0, 10);
//    Sneaker s3 = new Sneaker("Adidas", "Sean Wotherspoon x Disney x Superturf Adventure 'Jiminy Cricket'",
//                            "running",72.00, 1111185, 8.5, 6);
//    Sneaker s4 = new Sneaker("Vans", "Era Core Classics",  "skate",
//                            54.95, 1111195, 6.5, 17);


    public Sneaker(String brand, String itemName, String sport, Double price, Integer id, Double size, Integer stock) {
        super(itemName, price, id, stock);
        this.brand = brand;
        this.sport = sport;
        this.size = size;
    }

    public Sneaker(String expectedBrand, String expectedName, String expectedSport, Double expectedPrice, Double expectedSize, Integer expectedStock) {
    }

    public Sneaker(int nextId, String name, String brand, String sport, Double size, Integer stock, Double price) {
    }

    public Sneaker(String itemName, Double price, Integer id, Integer stock) {
        super(itemName, price, id, stock);
    }

    public Sneaker(String itemName, Double price, Integer id) {
        super(itemName, price, id);
    }

    public Sneaker() {
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
