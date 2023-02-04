package com.javacore.sample.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Example4 {
    public static void main(String[] args) {

        for (String email : new String[]{"s.noroozi.cs@gmail.com", null}) {
            Optional<String> stringOptional = Optional.ofNullable(email);
            String defaultOptional = stringOptional
                    .orElseThrow(() -> new IllegalArgumentException("Email does not exist."));
            System.out.println(defaultOptional);
        }

    }
}
