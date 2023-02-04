package com.javacore.sample.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> items = List.of(
                "pen", "book", "pen",
                "coin", "book", "desk",
                "book", "pen", "book",
                "coin");
        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting())
                );
        result.forEach((name, count) -> System.out.format("%s:\t%d%n", name, count));
    }
}