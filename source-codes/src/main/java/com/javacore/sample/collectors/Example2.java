package com.javacore.sample.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example2 {
    record Product(int id, String name, float price) {
    }


    public static void main(String[] args) {
        List<Example1.Product> productsList = new ArrayList();
        productsList.add(new Example1.Product(1, "HP Laptop", 25000f));
        productsList.add(new Example1.Product(2, "Dell Laptop", 30000f));
        productsList.add(new Example1.Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Example1.Product(4, "Sony Laptop", 28000f));
        productsList.add(new Example1.Product(5, "Apple Laptop", 90000f));
        productsList.add(new Example1.Product(6, "Apple Laptop", 120000f));

        Optional<Float> min = productsList.stream().map(Example1.Product::price).collect(Collectors.minBy(Float::compareTo));
        Optional<Float> max = productsList.stream().map(Example1.Product::price).collect(Collectors.maxBy(Float::compareTo));

        min.ifPresent(val -> System.out.printf("Minimum price is %.1f\n", val));
        max.ifPresent(val -> System.out.printf("Maximum price is %.1f\n", val));

        Double priceSums = productsList.stream().collect(Collectors.summingDouble(Example1.Product::price));
        System.out.println("Sum of prices: " + priceSums);

        Double priceAverage = productsList.stream().collect(Collectors.averagingDouble(Example1.Product::price));
        System.out.println("Average of prices: " + priceAverage);

        Long numberOfElements = productsList.stream().collect(Collectors.counting());
        System.out.println("Total elements : " + numberOfElements);
    }
}
