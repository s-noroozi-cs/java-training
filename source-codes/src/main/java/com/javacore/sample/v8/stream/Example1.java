package com.javacore.sample.v8.stream;

import com.javacore.sample.v8.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Product> productsList = Product.getSampleProducts();

        //requirement:
        // display only product that has price less than 30,000

        //before java 8
        List<Float> productPriceList = new ArrayList();
        for (Product product : productsList) {
            if (product.price() < 30000) {
                productPriceList.add(product.price());
            }
        }
        System.out.println(productPriceList);

        //java 8
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price() < 30000)
                .map(Product::price)
                .collect(Collectors.toList());
        System.out.println(productPriceList2);

    }
}
