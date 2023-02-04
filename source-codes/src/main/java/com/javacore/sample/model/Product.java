package com.javacore.sample.model;


import java.util.ArrayList;
import java.util.List;

public record Product(int id, String name, float price) {
    public static List<Product> getSampleProducts() {
        List<Product> productsList = new ArrayList();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        return productsList;
    }
}
