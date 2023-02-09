package com.javacore.sample.v8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        stream.limit(2)
                .forEach(element -> {
                    System.out.println(element);
                });
    }
}
