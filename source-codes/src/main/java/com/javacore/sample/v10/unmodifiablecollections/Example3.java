package com.javacore.sample.v10.unmodifiablecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        // creating object of ArrayList<Character>
        List<Character> list = new ArrayList<Character>();

        // populate the list
        list.add('X');
        list.add('Y');

        // printing the list
        System.out.println("Initial list: " + list);

        try {

            // getting unmodifiable list
            // using unmodifiableCollection() method
            Collection<Character>
                    immutableList = Collections.unmodifiableCollection(list);
            // Adding element to new Collection
            System.out.println("\nTrying to modify"
                    + " the unmodifiableCollection");

            immutableList.add('Z');
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
    }
}
