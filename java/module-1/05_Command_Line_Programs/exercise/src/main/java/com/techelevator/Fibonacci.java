package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userNumber = Integer.parseInt(userInput.nextLine());
		System.out.println("Please enter a number: "+userInput);
		fibSequence(userNumber);

	}

	public static int fibSequence(int userInput){
		boolean status = false;
		int count = 0;
		int firstInt = 0;
		int nextInt = 1;
		int sequenceTotal = 0;

		while (count<=userInput){
			if (count==0){
				//Initialize the sequence total to keep track
				nextInt = firstInt+nextInt;
				System.out.println("FirstInt "+firstInt+"NextInt "+nextInt+"Sequencetotal "+sequenceTotal);

				count++;
			}else{

				//Replace firstInt value as nextInt
				firstInt = nextInt;

				//Replace nextInt value as sum of previous
				nextInt = firstInt+nextInt;
				sequenceTotal = nextInt;
				System.out.println("FirstInt "+firstInt+"NextInt "+nextInt+"Sequencetotal "+sequenceTotal);
				count++;
			}



		}
		return sequenceTotal;
	}

}
