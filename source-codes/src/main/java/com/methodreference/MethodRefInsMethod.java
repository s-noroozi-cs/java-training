package com.methodreference;

public class MethodRefInsMethod {
    @FunctionalInterface
    interface Printable {
        void print(String msg);
    }

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        // 2. Method reference to an instance method of an object
        MethodRefInsMethod methodReferencesDemo = new MethodRefInsMethod();

        // lambda expression
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("hello world!");

        // using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("hello world!");
    }
}
