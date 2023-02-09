package com.javacore.sample.v8.collectors;

import com.javacore.sample.v8.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<Product> productsList = Product.getSampleProducts();

        Optional<Float> min = productsList.stream().map(Product::price).collect(Collectors.minBy(Float::compareTo));
        Optional<Float> max = productsList.stream().map(Product::price).collect(Collectors.maxBy(Float::compareTo));

        min.ifPresent(val -> System.out.printf("Minimum price is %.1f\n", val));
        max.ifPresent(val -> System.out.printf("Maximum price is %.1f\n", val));

        Double priceSums = productsList.stream().collect(Collectors.summingDouble(Product::price));
        System.out.println("Sum of prices: " + priceSums);

        Double priceAverage = productsList.stream().collect(Collectors.averagingDouble(Product::price));
        System.out.println("Average of prices: " + priceAverage);

        Long numberOfElements = productsList.stream().collect(Collectors.counting());
        System.out.println("Total elements : " + numberOfElements);
    }
}
