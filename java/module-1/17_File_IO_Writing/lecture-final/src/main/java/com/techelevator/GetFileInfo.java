package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class GetFileInfo {

    public static void main(String[] args) throws IOException {

        File newFile = new File("myDataFile.txt");
        String message =      " Testing \n  Hello World! \n Appreciate \n Elevate \n Participate"    ;

        PrintWriter writer = new PrintWriter(newFile);
        writer.print(message);
        writer.flush();
        writer.close();

//        File newFile = new File("myDirectory","myDataFile.txt");
//        newFile.createNewFile();
////
//        File newDirectory = new File("myDirectory");
//
//        File newFile = new File("myDataFile2.txt");
//
//        newFile.createNewFile();

//        if (newDirectory.exists()) {
//
//            System.out.println("Sorry " + newDirectory.getAbsolutePath()
//            +  " already exists.");
//
//        } else {
//            newDirectory.mkdir();
//        }

//        File myFile = new File("myDataFile.txt");
//
//        if ( myFile.exists()) {
//
//            System.out.println("File name: " + myFile.getName());
//            System.out.println("Absolute path :" + myFile.getAbsolutePath());
//            System.out.println("Writable :" + myFile.canWrite());
//            System.out.println("Readable " + myFile.canRead());
//            System.out.println("File size in bytes " + myFile.length());
//
//        } else {
//            System.out.println("The file does not exist.");
//        }




    }

}
