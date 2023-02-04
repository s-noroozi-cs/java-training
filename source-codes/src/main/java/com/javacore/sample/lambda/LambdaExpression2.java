package com.javacore.sample.lambda;

import java.util.Arrays;

public class LambdaExpression2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min;

        //solution 1
        min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.printf("Min: %d\n", min);

        //solution 2
        min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if(min > num)
                min = num;
        }
        System.out.printf("Min: %d\n", min);

        //solution 3
        min = Arrays.stream(numbers).min().getAsInt();
        System.out.printf("Min: %d\n", min);
    }
}
