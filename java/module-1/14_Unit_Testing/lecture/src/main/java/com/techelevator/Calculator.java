package com.techelevator;

import org.junit.Test;

public class Calculator {
    public int add(int first, int second){
        return first+second;
    }

    public double subtract(double first, double second){
        return first-second;
    }

    public boolean divBy2(int number){

        if(number%2==0){
            return true;
        }
        return false;
    }

}
