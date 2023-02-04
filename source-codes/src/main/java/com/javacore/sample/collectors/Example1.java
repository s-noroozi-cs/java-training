package com.javacore.sample.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
    record Product(int id, String name, float price) {
    }


    public static void main(String[] args) {
        List<Product> productsList = new ArrayList();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.add(new Product(6, "Apple Laptop", 120000f));
        List<Float> productPriceList =
                productsList
                        .stream()
                        .map(Product::price)
                        .collect(Collectors.toList());
        System.out.println(productPriceList);

        Set<String> productNameSet =
                productsList
                        .stream()
                        .map(Product::name)
                        .collect(Collectors.toSet());
        System.out.println(productNameSet);
    }

}
