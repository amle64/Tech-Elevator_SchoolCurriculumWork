package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        double discount = Double.parseDouble(scanner.nextLine());
        discount = 1-discount;



        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String lineInput = scanner.nextLine();
        String [] prices = lineInput.split(" ");

        for (int i = 0; i < prices.length; i++) {
            double discountedPrice = Double.parseDouble(prices[i])*discount;
            System.out.println("Original Price: "+prices[i]+" Sale Price: "+discountedPrice);

        }



    }

}