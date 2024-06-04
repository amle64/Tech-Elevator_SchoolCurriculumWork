package com.techelevator.exceptions;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number.");
//        //Double divisor = Double.parseDouble(scanner.nextLine());
//        int divisor = Integer.parseInt(scanner.nextLine());
//
//        //double result = 10.0 /divisor;
//        int result = 10 / divisor;
//        System.out.println("Result is :" + result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        //Double divisor = Double.parseDouble(scanner.nextLine());
        try {
            int divisor = Integer.parseInt(scanner.nextLine());
            int result = 10 / divisor;
            System.out.println("Result is :" + result);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

        //double result = 10.0 /divisor;


    }



}
