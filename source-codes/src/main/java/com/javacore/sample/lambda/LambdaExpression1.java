package com.javacore.sample.lambda;

import java.util.Arrays;

public class LambdaExpression1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum;

        //solution 1
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.printf("Sum: %d\n" , sum);

        //solution 2
        sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.printf("Sum: %d\n" , sum);

        //solution 3
        sum = Arrays.stream(numbers).sum();
        System.out.printf("Sum: %d\n" , sum);
    }
}
