package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.printf("Please enter the temperature: ");
		int temp = Integer.parseInt(userInput.nextLine());
		System.out.printf("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String tempType = userInput.nextLine();

		if (tempType.equals("C")){
			int tempC = conversionToFahrenheit(temp);
			System.out.println(temp+tempType+" is "+tempC+"F");
		}
		else if (tempType.equals("F")){
			int tempF = conversionToCelsius(temp);
			System.out.println(temp+tempType+" is "+tempF+"C");
		}


	}
	public static int conversionToCelsius (int temperatureFahrenheit){
		int temperatureCelsius = (int)((temperatureFahrenheit-32)/1.8);
		return temperatureCelsius;
	}

	public static int conversionToFahrenheit(int temperatureCelsius){
		int temperatureFahrenheit = (int)(temperatureCelsius*1.8)+32;
		return temperatureFahrenheit;
	}
}
