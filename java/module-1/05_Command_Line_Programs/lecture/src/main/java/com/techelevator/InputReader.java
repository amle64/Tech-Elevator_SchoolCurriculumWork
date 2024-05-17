package com.techelevator;

import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = userInput.nextLine();
        System.out.print("Please enter your height: ");
        String heightInput = userInput.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Your name is: " + name + ".");
        System.out.println("Your height is: " + height + " inches.");
    }

}
