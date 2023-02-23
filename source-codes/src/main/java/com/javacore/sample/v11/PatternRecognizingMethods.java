package com.javacore.sample.v11;

import java.util.regex.Pattern;

public class PatternRecognizingMethods {
    public static void main(String[] args){
        var str = Pattern.compile("aba").asMatchPredicate();

        System.out.println("str.test(\"aabb\"): " + str.test("aabb"));

        System.out.println("str.test(\"aba\"): " + str.test("aba"));

    }
}
