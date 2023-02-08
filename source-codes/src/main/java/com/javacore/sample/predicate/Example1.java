package com.javacore.sample.predicate;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> lesserThanEighteen = i -> (i < 18);
        System.out.println(lesserThanEighteen.test(10));
    }
}
