package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestAppendFile  {
    public static void main(String[] args) throws IOException {

        File newFile = new File("myDataFile.txt");
        String message = "Testing \n Hello World again!";

        PrintWriter writer = null;

        // Instantiate the writer object with append functionality.
        if ( newFile.exists()) {

            writer = new PrintWriter( new FileWriter(newFile, true));

        } else {
            writer = new PrintWriter(newFile);
        }

        writer.append(message);
        writer.flush();
        writer.close();

    }
}
