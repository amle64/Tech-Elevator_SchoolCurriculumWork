package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		int length = Integer.parseInt(userInput.nextLine());
		System.out.printf("Is the measurement in (m)eters, or (f)eet? ");
		String lengthType = userInput.nextLine();

		if (lengthType.equals("m")){
			int feet = conversionToFeet(length);
			System.out.println(length+lengthType+" is "+feet+"f");
		}
		else if (lengthType.equals("f")){
			int meters = conversionToMeters(length);
			System.out.println(length+lengthType+" is "+meters+"m");
		}


	}
	public static int conversionToMeters (int feet){
		int meters = (int)(feet*0.3048);
		return meters;
	}

	public static int conversionToFeet(int meters){
		int feet = (int)(meters*3.2808399);
		return feet;
	}

}
