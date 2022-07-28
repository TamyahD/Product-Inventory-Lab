public class Product {
    private String itemName;
    private Double price;
    private String id;
    private Integer stock;

    public Product(String itemName, Double price, String id, Integer stock) {
        this.itemName = itemName;
        this.price = price;
        this.id = id;
        this.stock = stock;
    }

    public Product(String itemName, Double price, String id) {
        this.itemName = itemName;
        this.price = price;
        this.id = id;
    }


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
