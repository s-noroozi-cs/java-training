package com.javacore.sample.parallelsort;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 0, 6, 9};
        System.out.println("before sort: " + Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("after  sort: " + Arrays.toString(arr));
    }
}
