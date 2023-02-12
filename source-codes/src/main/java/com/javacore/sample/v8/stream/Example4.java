package com.javacore.sample.v8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList()));
    }
}
