package com.javacore.sample.v8.functionalinterface;

interface Doable2 {
    default void doIt() {
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface SayAble extends Doable2 {
    void say(String msg);   // abstract method
}