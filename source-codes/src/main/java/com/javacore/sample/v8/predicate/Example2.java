package com.javacore.sample.v8.predicate;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result = greaterThanTen
                .and(lowerThanTwenty)
                .test(15);
        System.out.println(result);

        boolean result2 = greaterThanTen
                .and(lowerThanTwenty)
                .negate().test(15);
        System.out.println(result2);
    }
}