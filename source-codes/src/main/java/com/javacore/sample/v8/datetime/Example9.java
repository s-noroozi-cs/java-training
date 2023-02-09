package com.javacore.sample.v8.datetime;

import java.time.LocalDate;
import java.time.Month;

public class Example9 {
    public static void main(String[] args){
        LocalDate localDate1 = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2016, Month.JANUARY, 1);

        if (localDate1.isLeapYear()) {
            System.out.println(localDate1.getYear() + " is a leap year");
        } else {
            System.out.println(localDate1.getYear() + " is not a leap year");
        }

        if (localDate2.isLeapYear()) {
            System.out.println(localDate2.getYear() + " is a leap year");
        } else {
            System.out.println(localDate2.getYear() + " is not a leap year");
        }
    }
}
