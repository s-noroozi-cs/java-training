package com.javacore.sample.v9.diamondoperator;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    //to see affection of these changes,
    // you should be change project structure configuration
    // change module java language level

    // This is before Java 7. We have to explicitly mention generic type
    // on the right side as well.
    List<String> myList1 = new ArrayList<String>();

    // Since Java 7, no need to mention generic type on the right side
    // instead we can use diamond operator. Compiler can infer type.
    List<String> myList2 = new ArrayList<>();


    static abstract class MyClass<T> {
        abstract T add(T num, T num2);
    }


    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>() {
            Integer add(Integer x, Integer y) {
                return x + y;
            }
        };
        Integer sum = obj.add(100, 101);
        System.out.println(sum);
    }
}


