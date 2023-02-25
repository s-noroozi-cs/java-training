package com.javacore.sample.v12;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class SwitchExpressions {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                typeOfDay = "Working Day";
                break;
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Day Off";
        }
        System.out.println("day of week: " + typeOfDay);

        //new switch syntax
        typeOfDay = switch (dayOfWeek) {
            case SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY -> "Working Day";
            case THURSDAY, FRIDAY -> "Day Off";
        };
        System.out.println("day of week: " + typeOfDay);

    }
}
