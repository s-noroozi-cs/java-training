package com.optional;

import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {

        String email = "s.noroozi.cs@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        String value = stringOptional.get();
        System.out.println(value);

        System.out.println("----------------------");

        //throw NPE
        try {
            email = null;
            stringOptional = Optional.ofNullable(email);
            value = stringOptional.get();
            System.out.println(value);
        }catch (Throwable ex){
            System.out.println("Exception: " + ex.getMessage());
        }

        System.out.println("----------------------");

        //handle NPE
        for (String item : new String[]{"s.noroozi.cs@gmail.com", null}) {
            stringOptional = Optional.ofNullable(item);
            if (stringOptional.isPresent()) {
                System.out.println(stringOptional.get());
            } else {
                System.out.println("no value present");
            }
        }

    }
}
