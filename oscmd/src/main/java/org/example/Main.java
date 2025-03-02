package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Batch File");
        WinCmd.runBatchFile(args[0], args[1], args[2], args[3]);
    }
}