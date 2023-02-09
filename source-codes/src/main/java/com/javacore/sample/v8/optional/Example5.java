package com.javacore.sample.v8.optional;

import java.util.Optional;

public class Example5 {
    public static void main(String[] args) {

        //filter method
        //----------------------------

        // without Optional
        String result = "abc";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }

        // with Optional
        Optional<String> optionalStr = Optional.of(result);
        optionalStr
                .filter(s -> s.contains("abc"))
                .ifPresent(System.out::println);


        //map method
        //----------------------------

        // without Optional
        result = " abc ";
        if (result != null && result.contains("abc")) {
            System.out.println(result.trim());
        }

        // with Optional
        optionalStr = Optional.of(result);
        optionalStr
                .filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent(System.out::println);
    }
}
