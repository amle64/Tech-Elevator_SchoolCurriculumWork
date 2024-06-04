package com.techelevator.exceptions;

import java.util.Scanner;

public class TestException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");

        int result = 0;

        try{
            int divisor = Integer.parseInt(scanner.nextLine());
            result = 10/divisor;
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
