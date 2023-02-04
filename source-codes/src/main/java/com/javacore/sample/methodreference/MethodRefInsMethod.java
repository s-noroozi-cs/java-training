package com.javacore.sample.methodreference;

public class MethodRefInsMethod {
    @FunctionalInterface
    interface Printable {
        void print(String msg);
    }

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        MethodRefInsMethod methodReferencesDemo = new MethodRefInsMethod();

        // lambda expression
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("hello world!");

        // using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("hello world!");
    }
}
