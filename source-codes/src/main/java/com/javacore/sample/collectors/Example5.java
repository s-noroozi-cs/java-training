package com.javacore.sample.collectors;

import com.javacore.sample.model.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Product> productsList = Product.getSampleProducts();

        // Converting Product List into a Map
        Map<Integer, String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p -> p.id(), p -> p.name()));

        System.out.println(productPriceMap);
    }
}
