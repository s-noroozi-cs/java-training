package com.javacore.sample.v9.processapi;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();
        ProcessHandle.Info processInfo = processHandle.info();

        System.out.println("pid: " + processHandle.pid());
        System.out.println("start time: " + processInfo.startInstant());
        System.out.println("command: " + processInfo.command());
        System.out.println("arguments: " + processInfo.arguments().map(Arrays::toString));
    }
}
