package com.javacore.sample.predicate;

import java.util.function.Predicate;

class Example4 {
    public static Predicate<String> hasLengthOf10 = t -> t.length() > 10;

    public static void main(String[] args) {
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
}