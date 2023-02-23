package com.javacore.sample.v11;

import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
    public static void main(String[] args) throws Exception {
        Path pathOfFile1 = Path.of("/tmp/1.txt");
        Path pathOfFile2 = Path.of("/tmp/2.txt");

        //writeString
        Files.writeString(pathOfFile1, "this is a test message 1.");

        Files.writeString(pathOfFile2, "this is a test message 1.");

        //readString
        System.out.println("read content of path 1: " + Files.readString(pathOfFile1));

        //isSameFile --> is used to know whether two paths locate the same file or not
        System.out.println("path1 is same as path1: " + Files.isSameFile(pathOfFile1, pathOfFile1));
        System.out.println("path1 is same as path2: " + Files.isSameFile(pathOfFile1, pathOfFile2));
    }
}
