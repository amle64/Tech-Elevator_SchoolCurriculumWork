package com.techelevator.scanner;

public class OverdraftException2 extends RuntimeException{
    private double overdraftAmount = 0;

    public OverdraftException2(String message, double overdraftAmount) {
        super(message);
        this.overdraftAmount = overdraftAmount;
    }

    public double getOverdraftAmount2() {
        return overdraftAmount;
    }
}
