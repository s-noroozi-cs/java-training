package com.javacore.sample.defaultmethod;

interface Interface1 {
    default void show() {
        System.out.println("Default Interface1");
    }
}

interface Interface2 {
    default void show() {
        System.out.println("Default Interface2");
    }
}

public class Example2 implements Interface1,Interface2{


    @Override
    public void show() {
        // use super keyword to call the show

        Interface1.super.show();
        Interface2.super.show();
    }
}
