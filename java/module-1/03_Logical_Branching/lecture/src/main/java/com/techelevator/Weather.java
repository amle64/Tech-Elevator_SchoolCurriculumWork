package com.techelevator;

public class Weather {
    public static void main(String[] args) {
        boolean isRaining = false;
        int tempInF = 50;
        if (isRaining == true && tempInF < 70) {
            System.out.println("Wear a coat!");
        } else {
            System.out.println("No coat needed!");
        }
    }

}
