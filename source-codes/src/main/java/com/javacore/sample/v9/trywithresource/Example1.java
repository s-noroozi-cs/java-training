package com.javacore.sample.v9.trywithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileOutputStream fileStream=new FileOutputStream("try-with-resource.txt");){
            String greeting = "Welcome to Java.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
