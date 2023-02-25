package com.javacore.sample.v12;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello World!";

        //old syntax
        if (obj instanceof String) {
            String s = (String) obj;
            int length = s.length();
            System.out.println("len of obj: " + length);
        }

        //new syntax
        if (obj instanceof String s) {
            int length = s.length();
            System.out.println("len of obj: " + length);
        }
    }
}
