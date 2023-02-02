package com.optional;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {

        String email = "s.noroozi.cs@gmail.com";

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
    }
}
