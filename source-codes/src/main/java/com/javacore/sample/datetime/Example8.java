package com.javacore.sample.datetime;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example8 {
    public static void main(String[] args) {
        // ISO Date
        LocalDate localDate = LocalDate.parse("2017-05-03", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);

        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("2017/05/12", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate1);

        System.out.println("-------------------------");

        try {
            String persianDate = "1401/11/14";
            Locale locIran = new Locale("fa","IR");
            com.ibm.icu.text.DateFormat df = com.ibm.icu.text.DateFormat.getDateInstance(DateFormat.SHORT,locIran);
            System.out.println(persianDate + " persian parse " + df.parse(persianDate));
        }catch (Throwable ex){
            ex.printStackTrace();
        }

    }
}
