package com.lambda;

public class StrategyDesignPattern {
    interface ValidationStrategy {
        boolean execute(String s);
    }

}
