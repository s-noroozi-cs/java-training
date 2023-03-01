package com.javacore.sample.v9.collectionapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> references = List.of("1", "2", "3");

        System.out.println(references);

        operationA(references);

        System.out.println(references);

    }

    static void operationA(List<String> data) {
        //x,y,z
        System.out.println(data.stream()
                .collect(Collectors.joining(",", "*", "*")));
        data.add("4");
    }
}
