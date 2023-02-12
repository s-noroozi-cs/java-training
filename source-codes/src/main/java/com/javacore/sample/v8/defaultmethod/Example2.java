package com.javacore.sample.v8.defaultmethod;

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

public class Example2 implements Interface1
        ,Interface2
{

    public static void main(String[] args){
        new Example2().show();
    }

//    public void show(){
//        System.out.println("custom");
//    }


    @Override
    public void show() {
        // use super keyword to call the show

        Interface1.super.show();
        Interface2.super.show();
        System.out.println("custom");
    }
}
