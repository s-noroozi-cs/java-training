package com.stringjoiner;

import java.util.StringJoiner;

public class Example3 {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Stark");
        joinNames2.add("John");

        // Merging two StringJoiner
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);
    }
}
