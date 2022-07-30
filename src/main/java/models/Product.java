package models;

public abstract class Product {
    //TODO maybe add brand property here instead of individual product classes
    private String itemName;
    private Double price;
    private Integer id;
    private Integer stock;

    public Product(String itemName, Double price, Integer id, Integer stock) {
        this.itemName = itemName;
        this.price = price;
        this.id = id;
        this.stock = stock;
    }

    public Product(String itemName, Double price, Integer id) {
        this.itemName = itemName;
        this.price = price;
        this.id = id;
    }

    public Product() {}


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
