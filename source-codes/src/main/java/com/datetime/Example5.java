package com.datetime;

import java.util.Calendar;
import java.util.Locale;

public class Example5 {
    public static void main(String[] args) {
        Locale fa = new Locale("fa", "IR");

        System.out.println("\n------------ ibm icu calendar ------------");
        com.ibm.icu.util.Calendar cal = com.ibm.icu.util.Calendar.getInstance(fa);
        // Iterate through the days and print it out.
        for (int i = 0; i < 90; i++) {
            // print out the date.
            System.out.println(" year: " + cal.get(Calendar.YEAR) +
                    " month: " + (cal.get(Calendar.MONTH) + 1) +
                    " day : " + cal.get(Calendar.DAY_OF_MONTH)
            );
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
