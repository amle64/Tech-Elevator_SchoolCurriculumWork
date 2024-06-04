package com.techelevator.exceptions;

import java.util.Scanner;

public class TestException1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a number.");
        int divisor = Integer.parseInt(scanner.nextLine());
        int  result = 10 / divisor;

        System.out.println("Result is : " + result);



    }



}
