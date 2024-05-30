package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args){
        //Integer.parseInt();
        Scanner input = new Scanner (System.in);


        List<String> listOfStrings = new ArrayList<>();
        while (!input.nextLine().equals("STOP")){

            listOfStrings.add(input.nextLine());
        }

        Object [] arrayOfStrings = listOfStrings.toArray();
        int total = 0;
        for(Object string:arrayOfStrings){
            total += Integer.parseInt(String.valueOf(string));
            System.out.println("Each item is "+string);

        }
        System.out.println("Total is "+total);



    }
}
