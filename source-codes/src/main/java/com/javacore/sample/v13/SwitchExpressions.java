package com.javacore.sample.v13;

import java.time.LocalDate;

public class SwitchExpressions {
    public static void main(String[] args) {
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