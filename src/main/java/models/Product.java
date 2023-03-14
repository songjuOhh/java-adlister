package models;

import dao.Products;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String product;
    private int costInCent;

    private static  List<Products> products = new ArrayList<>();

    public Product(String product, int costInCent) {
        this.product = product;
        this.costInCent = costInCent;
    }

    public Product() {

    }

    public static List<Products> getProducts() {
        return products;
    }

    public static void setProducts(List<Products> products) {
        Product.products = products;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCostInCent() {
        return costInCent;
    }

    public void setCostInCent(int costInCent) {
        this.costInCent = costInCent;
    }
}
