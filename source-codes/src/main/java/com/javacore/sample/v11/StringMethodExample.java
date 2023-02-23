package com.javacore.sample.v11;

import java.util.stream.Collectors;

public class StringMethodExample {

    public static void main(String[] args) {
        // is blank
        String str1 = "";
        System.out.println(str1.isBlank());

        String str2 = "This is a test message";
        System.out.println(str2.isBlank());

        //lines
        String str3 = "This\nis\na\ntest\nmessage";
        System.out.println(str3.lines().collect(Collectors.toList()));

        //repeat
        String str4 = "This is a test message.";
        System.out.println(str4.repeat(4));

        //strip, stripLeading, stripTrailing
        //In short: strip() is "Unicode-aware" evolution of trim().
        // Meaning trim() removes only characters <= U+0020 (space);
        // strip() removes all Unicode whitespace characters
        //      (but not all control characters, such as \0

        String str5 = "   This is a test message   ";
        System.out.println("*" + str5.stripLeading() + "*");

        String str6 = "   This is a test message    ";
        System.out.println("*" + str6.stripTrailing() + "*");

        String str7 = "   This is a test message    ";
        System.out.println("*" + str7.strip() + "*");

    }
}
