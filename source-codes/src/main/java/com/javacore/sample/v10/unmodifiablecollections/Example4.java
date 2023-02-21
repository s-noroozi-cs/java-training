package com.javacore.sample.v10.unmodifiablecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        //List.CopyOf() vs Collections.unmodifiableList()

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Number> unmodifiableList = Collections.unmodifiableList(list);
        List<Integer> copyOfList = List.copyOf(list);

        //modifying the source list
        list.add(3);
        
        System.out.println("unmodifiableList: " + unmodifiableList);
        System.out.println("copyOfList: " + copyOfList);
    }
}
