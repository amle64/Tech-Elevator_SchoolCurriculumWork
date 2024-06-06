package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*String str1 = "beauty";
        String str2 = "beauty and";

        String [] strArray1 = str1.split(" ");
        String [] strArray2 = str2.split(" ");

        *//*for (String word:strArray1){
            System.out.println(word);
        }
        for (String word:strArray2){
            System.out.println(word);
        }*//*
        if (strArray1[0].equals(strArray2[0])){
            System.out.println("GOOD");
        }*/


        FindAndReplace test = new FindAndReplace();

        //java.io.File sourceFile, File destinationFile, String searchTerm, String replacementTerm
      // test.writeReplacedTextFile(new File ("elysian-fields.txt"),new File("elysian-fields-happy-path-multiple-2.txt"),"beauty and","charms with");
     //  test.writeReplacedTextFile(new File ("elysian-fields.txt"),new File("elysian-fields-happy-path-multiple-2.txt"),"beauty and","charms with");
      // test.writeReplacedTextFile(new File ("elysian-fields.txt"),new File("elysian-fields-happy-path-multiple-1.txt"),"ancient","venerable");
       test.writeReplacedTextFile(new File ("elysian-fields.txt"),new File("elysian-fields-happy-path-single-1.txt"),"beauty and","charms with");




    }


//    public void writeReplacedTextFile(File sourceFile, File destinationFile, String searchTerm, String replacementTerm) throws IOException {
//
//        //Use to print strings to the destination file
//        PrintWriter resultFile = new PrintWriter(destinationFile);
//
//
//
//        //Use scanner to read the sourceFile
//        try (Scanner scanner = new Scanner(sourceFile)){
//            while(scanner.hasNextLine()){
//                List<String> wordList = new ArrayList<>();
//                String line = scanner.nextLine();
//                String [] wordArray= line.split(" ");
//
//                //maybe remove?
//                String [] searchTermArray = searchTerm.split(" ");
//
//                //String [] wordArray2 = new String[wordArray.length+ searchTermArray.length];*/
//
//                for (int i = 0; i < wordArray.length; i++) {
//                    wordList.add(wordArray[i]);
//                }
//                boolean match = line.contains(searchTerm);
//                if (match){
//
//                    for (int i = 0; i < wordList.size(); i++) {
//                        if(searchTermArray.length>1){
//                            if(wordList.get(i).equals(searchTermArray[0])){
//                                wordList.set(i,replacementTerm);
//                                wordList.remove(i+1);
//                            }
//                        } else if (searchTermArray.length==1){
//                            if(wordList.get(i).equals(searchTerm)){
//                                wordList.set(i,replacementTerm);
//                            } else if(wordList.get(i).equals(searchTerm+",")){
//                                wordList.set(i, replacementTerm+",");
//                            }
//                        }
//
//                        /*if(wordList.get(i).equals(searchTermArray[0])&&searchTermArray.length>1){
//                            wordList.set(i,replacementTerm);
//                            wordList.remove(i+1);
//                        }*/
//
//
//
//                    }
//                    //System.out.println(wordList);
//
//                }
//
//                line = String.join(" ",wordList);
//                resultFile.println(line);
//
//            }
//            //If no file to read, catch exception
//        } catch (IOException e) {
//            throw e;
//        }
//
//        resultFile.flush();
//        resultFile.close();
}
