package com.javacore.sample.v10.localvariable;

public class Example2 {
    // error: 'var' is not allowed here
    //public var b = "hello";

    public static void main(String[] args) {
        // error: cannot use 'var' on variable without initializer
        //var v5;

        // error: variable initializer is 'null'
        //var emptyList = null;

        // error: lambda expression needs an explicit target-type
        //var p = (String s) -> s.length() > 10;

        // error: array initializer needs an explicit target-type
        //var arr = { 1, 2, 3 };
    }
}
