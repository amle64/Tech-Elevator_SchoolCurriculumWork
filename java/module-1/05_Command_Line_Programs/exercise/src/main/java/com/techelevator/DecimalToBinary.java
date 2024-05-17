package com.techelevator;

import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numberText = input.nextLine();
		double number = Double.parseDouble(numberText);
		System.out.println(number);
	}

}