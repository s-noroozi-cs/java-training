package com.javacore.sample.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Example3 {
    public static void main(String[] args) {

        for (String email : new String[]{"s.noroozi.cs@gmail.com", null}) {
            Optional<String> stringOptional = Optional.ofNullable(email);
            String defaultOptional = stringOptional.orElse("default@gmail.com");
            System.out.println(defaultOptional);
        }

        System.out.println("--------------------");

        Supplier<String> defaultEmailSupplier = () -> "default@gmail.com";
        for (String email : new String[]{"s.noroozi.cs@gmail.com", null}) {
            Optional<String> stringOptional = Optional.ofNullable(email);
            String defaultOptional = stringOptional.orElseGet(defaultEmailSupplier);
            System.out.println(defaultOptional);
        }

    }
}
