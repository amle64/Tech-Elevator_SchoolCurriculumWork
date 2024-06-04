package com.techelevator.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCheckEx {

    public static void main(String[] args) {
        File inputFile = new File("testFile.txt");


        try (Scanner scanner = new Scanner(inputFile)){
            //Scanner scanner = new Scanner(inputFile);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch(FileNotFoundException e){

            //System.out.println(e.getMessage());
            System.out.println("Please enter number");
            Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("You have typed"+x);

        }
    }



}
