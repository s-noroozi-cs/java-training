package com.javacore.sample.functionalinterface;

interface SayAble3 {
    void say(String msg);   // abstract method
}

//@FunctionalInterface
interface Doable extends SayAble3 {
    void doIt();
}

//compile error --> Multiple non-overriding abstract methods found in interface