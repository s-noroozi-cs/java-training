package com.javacore.sample.v8.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args){
        List< String > programmingLanguages = new ArrayList< >();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        String joined = programmingLanguages.stream().collect(Collectors.joining(","));

        System.out.printf("Joined string: %s", joined);
    }
}
