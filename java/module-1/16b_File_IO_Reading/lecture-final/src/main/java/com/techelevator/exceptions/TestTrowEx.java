package com.techelevator.exceptions;

public class TestTrowEx {

    public static void main(String[] args) {

    exceptionDemo(13);

    }

    public static void exceptionDemo(int x) {

        if (  x == 13  ) {

            throw new ArithmeticException("I don't like 13!!!!!!!");

        } else {
            System.out.println(" I am fine...");
        }

    }
}
