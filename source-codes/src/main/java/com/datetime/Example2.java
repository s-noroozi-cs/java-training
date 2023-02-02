package com.datetime;

import java.time.Duration;
import java.time.LocalDate;

public class Example2 {

    public static void main(String[] args) {
        //First LocalDate
        LocalDate today = LocalDate.now();      //1

        //Second LocalDate
        LocalDate sameDayNextMonth = LocalDate.now().plusMonths(1);     //2

        //Difference between dates
        Duration duration = Duration.between(
                today.atStartOfDay(),
                sameDayNextMonth.atStartOfDay());

        //Verify differences
        System.out.println("----------- Duration between two %s and %s -----------"
                .formatted(today, sameDayNextMonth));
        System.out.println("number of days: " + duration.toDays());
        System.out.println("number of hours: " + duration.toHours());
        System.out.println("number of minutes: " + duration.toMinutes());
        System.out.println("number of seconds: " + duration.getSeconds());
    }
}
