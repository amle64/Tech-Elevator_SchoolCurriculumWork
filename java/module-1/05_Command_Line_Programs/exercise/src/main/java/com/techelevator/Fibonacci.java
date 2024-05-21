package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner userInput = new Scanner(System.in);
		int userNumber = Integer.parseInt(userInput.nextLine());
		fibSequence(userNumber);
	}

	public static void fibSequence(int userInput) {


		//If userInput is a negative number
		if (userInput < 0) {
			int[] fiboArray = {0, 1};
			System.out.println(fiboArray[0]+", "+fiboArray[1]);
			return;
		}
		//Create array up for fibosequence
		int[] fiboArray = new int[userInput];

		//For loop
		for (int i = 0; i < userInput; i++) {
			//when i = 0 and i =1, special conditions that will yield the first 2 items in array.
			if (i == 0) {
				fiboArray[i] = 0;
				System.out.print(fiboArray[i]);
			} else if (i == 1) {
				fiboArray[i] = 1;
				System.out.print(", "+fiboArray[i]);
			//When i > 1, this is for the long fibosequences such as when the userinput is 17 or 34 ie.
			} else if (i > 1) {
				//Current item is the addition of the 2 previous items (indexes)
				fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];

				//Check condition if current item and previous item as a sum to be used in if statements
				int nextFiboCheck = fiboArray[i]+fiboArray[i-1];

				//If condition passes, this will stop the loop for the last item is not equal to userInput
				if (nextFiboCheck > userInput && nextFiboCheck!=userInput) {
					System.out.print(", "+fiboArray[i]);
					fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
					break;

				//If previous condition fails, and nextFiboCheck passes, this will print the final item == userInput
				}else if (nextFiboCheck == userInput){
					fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
					System.out.print(", "+fiboArray[i]);
					i++;
					fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
					System.out.print(", "+fiboArray[i]);
					break;
				}
				//Print any values that does not end the loop
				System.out.print(", "+fiboArray[i]);


			}

		}

	}

	}



