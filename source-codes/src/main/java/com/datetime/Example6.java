package com.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example6 {
    public static void main(String[] args) {
        // Current date time
        ZonedDateTime dateTime1 = ZonedDateTime.now();
        System.out.println(dateTime1);

        // Current date time from specified time-zone
        ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(dateTime2);
    }
}
