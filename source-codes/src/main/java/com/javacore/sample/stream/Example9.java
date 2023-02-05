package com.javacore.sample.stream;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList();

        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");

        System.out.println("any match: " +
                stringList.stream()
                        .anyMatch((value) -> value.startsWith("Java")));

        System.out.println("all match: " +
                stringList.stream()
                        .allMatch((value) -> value.contains("Guides")));

        System.out.println("none match: " +
                stringList.stream()
                        .noneMatch((value) -> value.startsWith("Ruby")));

        System.out.println("find any without filter: " +
                stringList.stream().findAny());

        System.out.println("find any with filter: " +
                stringList.stream()
                        .filter(v -> v.startsWith("Ruby"))
                        .findAny());


    }
}
