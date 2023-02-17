package com.javacore.sample.v9.trywithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
        //to see affection of these changes,
        // you should be change project structure configuration
        // change module java language level

        String filePath = "target/try-with-resource.txt";

        //java 7 syntax
        try(FileOutputStream fileStream=new FileOutputStream(filePath);){
            fileStream.write("Welcome to Java Training Course.".getBytes());
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }

        //java 9 syntax
        FileOutputStream fileStream=new FileOutputStream(filePath);
        try(fileStream){
            fileStream.write("Welcome to Java Training Course.".getBytes());
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
