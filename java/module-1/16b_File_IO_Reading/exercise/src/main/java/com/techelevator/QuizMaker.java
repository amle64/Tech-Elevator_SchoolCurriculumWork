package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			QuizMaker quizMaker = new QuizMaker();
			//quizMaker.run();
			List<String> list = quizMaker.getMatchingLines(new File("hidden-cafe.txt"),"outside",true, false);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println(list);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() throws IOException {
		/* Your code goes here */
		//getMatchingLines(new File("alice.txt"),"Alice",false, true);

	}
	public List<String> getMatchingLines(File file, String searchTerm, boolean isCaseSensitive, boolean includeLineNumbers) throws IOException {
		List<String> matchingLines = new ArrayList<>();

		int lineNumber = 1;
		try (Scanner inputScanner = new Scanner(file)){
			while (inputScanner.hasNextLine()){
				String line = inputScanner.nextLine();
				String [] wordsArray = line.split(" ");

				boolean matches = isCaseSensitive ? line.contains(searchTerm) : line.toLowerCase().contains(searchTerm.toLowerCase());
				if(matches){
					if(includeLineNumbers){
						matchingLines.add(lineNumber+") "+line);
					} else {
						matchingLines.add(line);
					}

				}

				lineNumber++;
			}
		} catch (IOException e){
			throw e;
		}
		return matchingLines;

	}


}
