package com.techelevator.exceptions;

public class TestThrowEx {
    public static void main(String[] args){
        exceptionDemo(10);
        exceptionDemo(13);
    }

    public static void exceptionDemo(int x){
        if (x == 13) {
            throw new ArithmeticException("I don't like 13");
        } else {
            System.out.println("I am fine");
        }
    }
}
