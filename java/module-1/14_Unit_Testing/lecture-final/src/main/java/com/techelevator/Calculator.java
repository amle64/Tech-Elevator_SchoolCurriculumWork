package com.techelevator;

import java.math.BigDecimal;

public class Calculator {

    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean divBy2 (int i){

        return i % 2 == 0;

    }

//    public boolean isEven(int number) {
//        return number % 2 == 0;
//    }

}
