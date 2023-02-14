package com.javacore.sample.v9.collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        //old way
        List<String> listOld = new ArrayList<>();
        listOld.add("Java");
        listOld.add("JavaFX");
        listOld.add("Spring");
        listOld.add("Hibernate");
        listOld.add("JSP");

        //new way
        List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");

        Set<String> set = Set.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");

        Map<Integer, String> map = Map.of(
                101, "JavaFX",
                102, "Hibernate",
                103, "Spring MVC");


        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");

        Map<Integer, String> mapOfEntry = Map.ofEntries(e1,e2);
    }
}
