package com.javacore.sample.v10.unmodifiablecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        //java.util.List,
        // java.util.Map and
        // java.util.Set
        // each got a new static method copyOf(Collection).
        //It returns the unmodifiable copy of the given Collection:

        List<Integer> someIntList = new ArrayList<>();
        Stream.of(1, 2, 3).forEach(someIntList::add);

        try {
            List<Integer> copyList = List.copyOf(someIntList);
            copyList.add(4);
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
    }
}
