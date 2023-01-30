package com.methodreference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodRefConstructorExam {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");


        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        // refactoring using method reference
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));
    }
}
