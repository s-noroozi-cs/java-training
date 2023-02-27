package com.javacore.sample.v13;

import java.time.LocalDate;

public class SwitchExpressions {
    public static void main(String[] args) {
        //Switch expressions were introduced in Java 12.
        // Break is used here to define return values:

//        int numLetters = switch (LocalDate.now().getDayOfWeek()) {
//            case MONDAY, FRIDAY, SUNDAY:
//                break 6;
//            case TUESDAY:
//                break 7;
//            case THURSDAY, SATURDAY:
//                break 8;
//            case WEDNESDAY:
//                break 9;
//        };

        int numLetters = switch (LocalDate.now().getDayOfWeek()) {
            case MONDAY, FRIDAY, SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY, SATURDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
        };
    }
}