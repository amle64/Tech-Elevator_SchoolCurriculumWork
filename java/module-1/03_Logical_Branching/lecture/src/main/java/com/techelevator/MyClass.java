package com.techelevator;

public class MyClass {

    public static void main(String[] args) {
        ageCheck(2024,1983);
        ageCheck(1984,1983);


    }
    public static void ageCheck(int currentYear, int yearBorn){
        int ageThisYear = currentYear - yearBorn;
        String greeting = "In " + currentYear + " you will be ";
        if( ageThisYear == 1 ) {
            System.out.println("Happy 1st birthday!");
        } else {
            System.out.println(greeting + ageThisYear);
        }
    }
}
