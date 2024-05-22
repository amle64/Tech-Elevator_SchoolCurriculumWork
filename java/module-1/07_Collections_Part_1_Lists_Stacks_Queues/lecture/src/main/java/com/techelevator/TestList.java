package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Rick");
        names.add("Beth");
        names.add("Jerry");
        names.add(0,"Sam");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        //Enhanced for loop
        for (String n: names){
            System.out.println(n);
        }
    }
}
