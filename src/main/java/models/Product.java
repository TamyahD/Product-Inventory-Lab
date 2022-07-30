package models;

public abstract class Product {
    //TODO maybe add brand property here instead of individual product classes
    private String name;
    private Double price;
    private int id;
    private Integer stock;
//    private Integer id;

    public Product(String name, Double price, int id, Integer stock) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.stock = stock;
    }

    public Product(String name, Double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
