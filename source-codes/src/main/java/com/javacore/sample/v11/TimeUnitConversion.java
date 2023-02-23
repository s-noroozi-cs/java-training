package com.javacore.sample.v11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitConversion {

    public static void main(String[] args) {
        TimeUnit timeUnitDays = TimeUnit.DAYS;

        System.out.println("time unit: " + timeUnitDays);

        System.out.println("convert 24 hours: " + timeUnitDays.convert(Duration.ofHours(24)));

        System.out.println("convert 50 hours: " + timeUnitDays.convert(Duration.ofHours(50)));
    }
}
