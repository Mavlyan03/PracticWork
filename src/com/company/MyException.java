package com.company;

public class MyException extends Throwable implements  AutoCloseable {
    @Override
    public void close() throws Exception {
    }
    public void exception() {
        System.err.println("You enter wrong number!");
    }
}
