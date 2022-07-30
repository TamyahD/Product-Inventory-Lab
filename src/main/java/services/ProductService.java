package services;

import models.Product;

public interface ProductService {

    public Product findProduct(int id);

    public Product[] findAll();

    public boolean delete(int id);
}
