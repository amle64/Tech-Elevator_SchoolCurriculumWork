package com.techelevator;

import java.io.File;
import java.io.IOException;

public class GetFileInfo {

    public static void main(String[] args) throws IOException {

        File myFile = new File("filename.txt");

        /*if(myFile.exists()){
            System.out.println("File name "+myFile.getName());
            System.out.println("Absolute path : "+myFile.getAbsolutePath());
            System.out.println("Writable: "+myFile.canWrite());
            System.out.println("Readable:  "+myFile.canRead());
            System.out.println("File name in bytes "+myFile.length());

        } else {
            System.out.println("The file does not exist.");
        }*/

        /*File newDirectory = new File("myDirectory");

        if (newDirectory.exists()){
            System.out.println("Sorry "+newDirectory.getAbsolutePath()+" already exists");
        } else {
            newDirectory.mkdir();
        }*/


        /*File newFile = new File("myDirectory", "myDataFile.txt");
        newFile.createNewFile();*/
    }
}
