package com.javacore.sample.v8.datetime;

import com.ibm.icu.text.DateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Example8 {
    public static void main(String[] args) throws Exception {
        // ISO Date
        LocalDate localDate = LocalDate.parse("2017-05-03", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);

        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("2017/05/12", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate1);

        System.out.println("-------------------------");

        try {
            String persianDate = "1401/11/14";
            Locale locIran = new Locale("fa", "IR");
            com.ibm.icu.text.DateFormat df = com.ibm.icu.text.DateFormat.getDateInstance(DateFormat.SHORT, locIran);
            System.out.println(persianDate + " persian parse " + df.parse(persianDate));
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

        //thread safe issue
        String persianDate = "1401/11/14";
        Locale locIran = new Locale("fa", "IR");
        final com.ibm.icu.text.DateFormat df = com.ibm.icu.text.DateFormat.getDateInstance(DateFormat.SHORT, locIran);
        Date baseDate = df.parse(persianDate);
        ExecutorService executor = Executors.newFixedThreadPool(10);

        AtomicInteger taskCounter = new AtomicInteger(0);
        int taskCount = 50;

        System.out.println("\n========= thread safe issue =========");
        Runnable task = () -> {
            try {
                Thread.sleep(100);
                Date d = df.parse(persianDate);
                if (d.compareTo(baseDate) == 0)
                    System.out.println(persianDate + " persian parse " + d);
                else
                    System.err.println(persianDate + " persian parse " + d);
            } catch (Throwable ex) {
                ex.printStackTrace();
            } finally {
                taskCounter.incrementAndGet();
            }
        };

        for (int i = 0; i < taskCount; i++) {
            executor.execute(task);
        }

        while (taskCounter.get() < taskCount) ;

        System.out.println("\n========= thread safe solution =========");
        //thread safe solution
        task = () -> {
            try {
                Thread.sleep(100);
                Date d = com.ibm.icu.text.DateFormat
                        .getDateInstance(DateFormat.SHORT, locIran)
                        .parse(persianDate);
                if (d.compareTo(baseDate) == 0)
                    System.out.println(persianDate + " persian parse " + d);
                else
                    System.err.println(persianDate + " persian parse " + d);
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        };

        for (int i = 0; i < 50; i++) {
            executor.execute(task);
        }

        executor.shutdown();
    }
}
