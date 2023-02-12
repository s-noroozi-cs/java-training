package com.javacore.sample.v8.defaultmethod;

@FunctionalInterface
interface InterfaceA {
    void square(int a);
    default void defaultMethod() {
        System.out.println("Default Method Executed");
    }

    static void staticMethod() {
        System.out.println("Static Method Executed");
    }
}

public class Example1 implements InterfaceA {

    @Override
    public void square(int a) {
        System.out.println("square: " + (a * a));
    }

    public static void main(String args[]) {
        Example1 example = new Example1();
        example.square(4);
        example.defaultMethod();
        InterfaceA.staticMethod();
    }
}
