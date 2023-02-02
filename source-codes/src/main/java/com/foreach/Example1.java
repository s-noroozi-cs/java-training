package com.foreach;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<String> gamesList = new ArrayList();
        gamesList.add("Hockey");
        gamesList.add("Football");
        gamesList.add("Chess");
        gamesList.add("Cricket");

        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));

        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.forEach(System.out::println);
    }
}
