package models;

import java.util.ArrayList;
import java.util.List;

public class Product2 {

    private String name;
    private double price;

    private static List<Product2> products = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Product2> getProducts() {
        return products;
    }

    public static void setProducts(List<Product2> products) {
        Product2.products = products;
    }

    public Product2(){

    }

    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
