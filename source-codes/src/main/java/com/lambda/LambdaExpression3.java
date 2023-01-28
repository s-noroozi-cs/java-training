package com.lambda;

import com.model.Payment;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaExpression3 {
    public static void main(String[] args) {
        Payment[] payments = new Payment[100];
        for (int i = 0; i < payments.length; i++) {
            payments[i] = Payment.makeRandomPayment();
        }


        //request sum of ali's payments for last 3 days"

        //iterative solution
        BigDecimal sum = BigDecimal.ZERO;
        for (Payment payment : payments) {
            if (payment.payer().equals("ali") || payment.payee().equals("ali")) {
                sum = sum.add(payment.amount());
            }
        }
        System.out.printf("Sum: %s", sum.toPlainString());

        //lambda expression solution
        sum = Arrays.stream(payments)
                .filter(p -> "ali".equals(p.payee()) || "ali".equals(p.payer()))
                .map(Payment::amount)
                .collect(Collectors.reducing((a, b) -> a.add(b)))
                .get();
        System.out.printf("Sum: %s", sum.toPlainString());
    }
}
