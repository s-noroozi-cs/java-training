package com.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRefStaticMethod {

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {

        // lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // using method reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        // lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodRefStaticMethod.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

        // using method reference
        BiFunction<Integer, Integer, Integer> biFunction = MethodRefStaticMethod::addition;
        System.out.println(biFunction.apply(10, 20));
    }
}
