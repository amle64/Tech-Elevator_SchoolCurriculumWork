package com.techelevator;

public class TestStringArray1
{
    public static void main(String[] args)
    {
        String[] cars = new String[5];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Lexus";
        cars[4] = "hi";

        for ( int i =0 ; i < cars.length ; i++) // i is the counter
        {
            System.out.println(cars[i]);


        }

    }
}
