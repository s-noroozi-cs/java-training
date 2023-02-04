package com.javacore.sample.stringjoiner;

import java.util.StringJoiner;

public class Example1 {
    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",");

        // Adding values to StringJoiner
        joinNames.add("John");
        joinNames.add("Tony");
        joinNames.add("Amir");
        joinNames.add("Prabhas");
        System.out.println(joinNames);

        joinNames = new StringJoiner("|"); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("John");
        joinNames.add("Tony");
        joinNames.add("Amir");
        joinNames.add("Prabhas");
        System.out.println(joinNames);
    }
}
