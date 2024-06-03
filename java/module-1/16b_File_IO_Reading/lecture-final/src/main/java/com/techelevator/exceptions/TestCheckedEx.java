package com.techelevator.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCheckedEx {

    public static void main(String[] args) throws FileNotFoundException  {

        File inputFile = new File("testFile.txt");

        //Scanner myScanner = null;

        try (  Scanner myScanner = new Scanner(inputFile)     )  {

            //myScanner = new Scanner(inputFile);

            while (myScanner.hasNextLine()) {

                System.out.println(myScanner.nextLine());

            }
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } finally {

            //myScanner.close();

        }


    }





}
