package com.techelevator.exceptions;

public class TestUncheckedEx {
    public static void main(String[] args) {
        System.out.println("The following cities: ");

        String[] cities = new String[]{"Cleveland", "Columbus","Cincinnati"};

        try{
            System.out.println(cities[0]);
            System.out.println(cities[1]);
            System.out.println(cities[2]);
            System.out.println(cities[3]);


            System.out.println("are all in Ohio");
        } catch (ArrayIndexOutOfBoundsException exeption){
            System.out.println("Error message occurred");
        }



        System.out.println("Hello World");
        try {
            for(int i = 0;i<= cities.length;i++){
                System.out.println(cities[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error here");
        }
    }

}
