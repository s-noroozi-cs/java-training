package com.javacore.sample.v12;

public class StringNewMethods {
    public static void main(String[] args) {
        String text = "Hello!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);


        String text2 = "Hello";
        String transformed = text2.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println("text: %s, reverse: %s".formatted(text2,transformed));
    }
}
