package com.javacore.sample.functionalinterface;

@FunctionalInterface
interface SayAble2 {
    void say(String msg);   // abstract method

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
public class Example2 implements SayAble2 {
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        new Example2().say("Hello there");
    }
}
