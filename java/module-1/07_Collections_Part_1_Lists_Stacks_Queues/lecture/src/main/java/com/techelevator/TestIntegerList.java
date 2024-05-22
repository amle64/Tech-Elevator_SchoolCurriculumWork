package com.techelevator;

import java.util.List;
import java.util.ArrayList;

public class TestIntegerList {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();

        ages.add(29);
        ages.add(21);
        ages.add(35);
        ages.add(32);


        /*for (Integer i:ages){
            System.out.println(i);
        }*/

        ages.add(0,32);

        for(Integer i:ages){
            System.out.println(i);
        }
    }
}
