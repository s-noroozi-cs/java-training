package com.javacore.sample.v8.datetime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Example3 {
    public static void main(String[] args){
        // ISO pattern
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX")));

        // 'yyyy-MMM-dd HH:mm:ss z' pattern
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // 'yyyy-MM-dd KK:mm:ss a' pattern
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd KK:mm:ss a")));
    }
}
