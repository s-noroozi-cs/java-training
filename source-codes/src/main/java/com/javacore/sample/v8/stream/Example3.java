package com.javacore.sample.v8.stream;

import com.javacore.sample.v8.model.Product;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Product> productsList = Product.getSampleProducts();
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(Product::price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(Product::price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

    }
}
