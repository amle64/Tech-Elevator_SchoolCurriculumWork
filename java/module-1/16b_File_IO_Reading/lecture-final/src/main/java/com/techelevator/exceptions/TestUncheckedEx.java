package com.techelevator.exceptions;

public class TestUncheckedEx {
    public static void main(String[] args) {

        System.out.println("The following cities: ");
        String[] cities = {"Cleveland", "Columbus", "Cincinnati"};

        try {
            System.out.println(cities[0]);
            System.out.println(cities[1]);
            System.out.println(cities[2]);
            System.out.println(cities[3]);  // This statement will throw an ArrayIndexOutOfBoundsException
            System.out.println("are all in Ohio."); // This line won't execute because the previous statement throws an Exception
        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("XXX Uh-no,  something went wrong... XXXX");

        }

        System.out.println("Hello World!");

        try {


            for (int i = 0; i <= cities.length; i++) {

                System.out.println(cities[i]);

            }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("We have a problem here....");

        }
    }
}

