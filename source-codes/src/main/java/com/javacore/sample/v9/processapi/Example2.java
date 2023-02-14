package com.javacore.sample.v9.processapi;

import java.io.File;

public class Example2 {
    public static void main(String[] args)throws Exception{
        ProcessBuilder builder = new ProcessBuilder("ls", "-la");
        builder.directory(new File("/"));
        builder.redirectOutput(new File("java9-process-ls-output.txt"));
        Process process = builder.start();

        int exitValue = process.waitFor();
        if (exitValue == 0) {
            System.out.println("Process completed successfully");
        } else {
            System.out.println("Process failed with exit code " + exitValue);
        }
    }
}
