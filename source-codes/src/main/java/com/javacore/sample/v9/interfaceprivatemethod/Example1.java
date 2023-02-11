package com.javacore.sample.v9.interfaceprivatemethod;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Example1 {
    interface CustomCalculator {
        default int addEvenNumbers(int... numbers) {
            return add(n -> n % 2 == 0, numbers);
        }

        default int addOddNumbers(int... numbers) {
            return add(n -> n % 2 != 0, numbers);
        }

        private int add(IntPredicate predicate, int... numbers) {
            return IntStream.of(numbers)
                    .filter(predicate)
                    .sum();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CustomCalculator calc = new CustomCalculator() {
        };

        System.out.println("add even number %s: %d"
                .formatted(Arrays.toString(numbers),
                        calc.addEvenNumbers(numbers)));
        System.out.println("add odd number %s: %d"
                .formatted(Arrays.toString(numbers),
                        calc.addOddNumbers(numbers)));
    }
}
