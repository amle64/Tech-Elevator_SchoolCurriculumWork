package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList2 {
    public static void main(String[] args) {
        String[] names = {"Tom","Time", "Joe", "Jim"};

        //This create a list variable using a fixed array
        //List<String> moreNames = Arrays.asList(names);

        //Convert a fixed array to a list (dynamic)
        List<String> moreNames = new ArrayList<>(Arrays.asList(names));

        System.out.println(moreNames.size());

        moreNames.add(0,"Jane");
        //System.out.println(moreNames);

        for(String n:moreNames){
            System.out.println(n);
        }
    }
}
