package com.javacore.sample.v8.functionalinterface;

@FunctionalInterface
interface SayAble1 {
    void say(String msg);
}

public class Example1 implements SayAble1 {
    public void say(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        new Example1().say("Hello there");
    }
}
