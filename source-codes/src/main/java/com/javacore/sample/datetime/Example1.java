package com.javacore.sample.datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Time: " + currentDate);

        System.out.println("Current local date: "
                + convertToLocalDate(currentDate));

        System.out.println("Current local date-time: "
                + convertToLocalDateTime(currentDate));

    }

    static LocalDate convertToLocalDate(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    static LocalDateTime convertToLocalDateTime(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
