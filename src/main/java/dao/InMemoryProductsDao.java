package dao;

import models.Product2;

import java.util.List;

public class InMemoryProductsDao implements Products {

    List<Product2> products = Product2.getProducts();

    @Override
    public List<Product2> all(){
        return products;
    }

    @Override
    public void insert(Product2 product) {
        products.add(product);
    }
}
