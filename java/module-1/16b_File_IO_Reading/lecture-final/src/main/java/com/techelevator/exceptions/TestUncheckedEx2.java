package com.techelevator.exceptions;

public class TestUncheckedEx2 {

    public static void main(String[] args) {

        System.out.println("The following cities: ");
        String[] cities = {"Cleveland", "Columbus", "Cincinnati"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        //System.out.println(cities[3]);  // This statement will throw an ArrayIndexOutOfBoundsException
        System.out.println("are all in Ohio."); // This line won't execute because the previous statement throws an Exception

    }
}
