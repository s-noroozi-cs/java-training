package com.javacore.sample.v8.parallelsort;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = new int[30_000_000];
        Consumer<int[]> initArray = array ->
                IntStream.range(0, arr.length)
                        .forEach(i -> arr[i] = (int) (Math.random()));

        initArray.accept(arr);
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        System.out.println("sort elapse time: " + (System.currentTimeMillis()-start));


        initArray.accept(arr);
        start = System.currentTimeMillis();
        Arrays.parallelSort(arr);
        System.out.println("parallel sort elapse time: " + (System.currentTimeMillis()-start));
    }

}
