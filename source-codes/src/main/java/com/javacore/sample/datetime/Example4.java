package com.javacore.sample.datetime;

import java.util.Date;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {
        Locale en = new Locale("en", "US");
        Locale fa = new Locale("fa", "IR");

        //reference for format
        // https://unicode-org.github.io/icu/userguide/format_parse/datetime/#simpledateformat

        //MMM month name
        //E day of week
        String pattern = "YYYY MMM E";
        Date now = new Date();

        System.out.println("\n--------- java text simple format ---------");
        for (Locale locale : new Locale[]{en, fa}) {
            System.out.println(formatJavaText(locale,pattern,now));
        }

        System.out.println("\n--------- ibm icu simple format ---------");
        for (Locale locale : new Locale[]{en, fa}) {
            System.out.println(formatIbmIcu(locale,pattern,now));
        }
    }

    private static String formatJavaText(Locale locale, String pattern, Date date) {
        return new java.text.SimpleDateFormat(pattern, locale).format(date);
    }
    private static String formatIbmIcu(Locale locale, String pattern, Date date) {
        return new com.ibm.icu.text.SimpleDateFormat(pattern, locale).format(date);
    }
//
//    private static String convert(String data){
//        StringBuilder sb = new StringBuilder();
//        for(char ch : data.toCharArray()){
//            switch (ch){
//                case
//            }
//        }
//    }
}
