package com.javacore.sample.v10.localvariable;

import java.util.*;

public class Example1 {

    public static void main(String[] args){
        String v1 = "Good bye, Java 9";
        var v2 = "Hello, Java 10";

        Map<Integer, String> v3 = new HashMap<>();
        var v4 = new HashMap<Integer, String>();

        Object[] objects = {
                v1,v2
                ,v3,v4
        };

        Arrays.stream(objects).forEach(o ->
                System.out.println("type: " + o.getClass() + ", value: " + o));
    }
}
