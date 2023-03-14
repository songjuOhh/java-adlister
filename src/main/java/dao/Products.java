package dao;

import models.Product2;
import java.util.List;


public interface Products {
    List<Product2> all();
    void insert(Product2 product);
}
