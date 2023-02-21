package com.javacore.sample.v10.unmodifiablecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        //java.util.stream.Collectors
        // get additional methods to collect a Stream
        // into unmodifiable List, Map or Set:


        List<Integer> someIntList = new ArrayList<>();
        Stream.of(1, 2, 3).forEach(someIntList::add);

        try {
            List<Integer> evenList = someIntList.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toUnmodifiableList());
            evenList.add(4);
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
    }
}
