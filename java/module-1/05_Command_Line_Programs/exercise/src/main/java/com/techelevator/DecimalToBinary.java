package com.techelevator;

import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		//A string of numbers
		String listOfNumbers = input.nextLine();
		int[] arrayOfNumbers = arrayConversion(listOfNumbers);
		for (int i = 0; i <arrayOfNumbers.length ; i++) {
			if (arrayOfNumbers[i]==0){
				break;
			}
			System.out.printf(arrayOfNumbers[i]+" in binary is ");
			decToBinary(arrayOfNumbers[i]);
		}

	}
	public static void decToBinary(int number) {

		String binary = "";
		while (number > 0) {
			int remainder = number % 2;
			binary = binary+String.valueOf(remainder); // Append the remainder
			number = number / 2; // Update number to be the quotient
		}
		String binaryFinal = "";
		for (int i = binary.length()-1; i>=0; i--) {
			if (i ==binary.length()){
				binaryFinal = String.valueOf(binary.charAt(i));
			} else {
				binaryFinal = binaryFinal+String.valueOf(binary.charAt(i));
			}

		}
		System.out.printf(binaryFinal+"%n");

	}
	public static int[] arrayConversion(String listOfNumbers){
		String[] arrayOfStrings = listOfNumbers.split(" ");
		int [] arrayOfNumbers = new int[listOfNumbers.length()];
		for (int i = 0; i < arrayOfStrings.length; i++) {
			arrayOfNumbers[i] = Integer.parseInt(arrayOfStrings[i]);
		}
		return arrayOfNumbers;
	}

}