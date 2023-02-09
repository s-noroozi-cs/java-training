package com.javacore.sample.v8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        List<String> gamesList = new ArrayList();
        gamesList.add("Hockey");
        gamesList.add("Football");
        gamesList.add("Chess");
        gamesList.add("Cricket");


        //return game that start with "c"
        //---------------------------------

        // before java 8 -->
        for (final String game : gamesList) {
            if (game.startsWith("C"))
                System.out.println(game);
        }

        // java 8 with lambda expression
        gamesList.forEach(g -> {
            if (g.startsWith("C"))
                System.out.println(g);
        });
    }
}
