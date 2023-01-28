package com.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Payment(BigDecimal amount, String payer, String payee, LocalDateTime time) {
    private static final String[] RANDOM_NAMES = {"ali", "reza", "hasan", "javad", "ahmad"};

    public static Payment makeRandomPayment() {
        BigDecimal amount = BigDecimal.valueOf((long) (Math.random() * 1_000));
        String payer = RANDOM_NAMES[(int) (Math.random() * RANDOM_NAMES.length)];
        String payee = RANDOM_NAMES[(int) (Math.random() * RANDOM_NAMES.length)];
        int randomDays = (int) (Math.random() * 10);
        LocalDateTime time = LocalDateTime.now().minusDays(randomDays);
        return new Payment(amount, payer, payee, time);
    }
}
