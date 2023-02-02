package com.datetime;

import java.time.LocalTime;

public class Example7 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(9, 10, 50);
        LocalTime localTime2 = LocalTime.of(9, 10, 50);
        LocalTime localTime3 = LocalTime.of(11, 45, 20);

        // compareTo() example
        if (localTime1.compareTo(localTime2) == 0) {
            System.out.println("localTime1 and localTime2 are equal");
        } else {
            System.out.println("localTime1 and localTime2 are not equal");
        }

        // isBefore() example
        if (localTime2.isBefore(localTime3)) {
            System.out.println("localTime2 comes before localTime3");
        }

        // isAfter() example
        if (localTime3.isAfter(localTime1)) {
            System.out.println("localTime3 comes after localTime1");
        }
    }
}
