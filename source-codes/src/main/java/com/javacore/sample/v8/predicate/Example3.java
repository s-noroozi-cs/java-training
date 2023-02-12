package com.javacore.sample.v8.predicate;

import java.util.function.Predicate;

class Example3 {
    public static Predicate<String> hasLengthOf10 = t -> t.length() > 10;

    public static void main(String[] args) {
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.and(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
}