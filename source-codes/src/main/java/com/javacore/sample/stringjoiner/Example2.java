package com.javacore.sample.stringjoiner;

import java.util.StringJoiner;

public class Example2 {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        // Adding values to StringJoiner
        joinNames.add("Ramesh");
        joinNames.add("Tony");
        joinNames.add("Stark");
        joinNames.add("John");

        System.out.println(joinNames);
    }
}
