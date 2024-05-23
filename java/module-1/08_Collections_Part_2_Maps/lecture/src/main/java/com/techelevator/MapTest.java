package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> reservations = new HashMap<>();

        reservations.put("HY234-9234","Rick");
        reservations.put("HY234-4235","Beth");
        reservations.put("HY234-3234","Jerry");

        /*System.out.println(reservations.containsValue("Rick"));
        System.out.println(reservations.containsValue("Betsy"));
        System.out.println(reservations.containsValue("HY234-3234"));*/

        /*System.out.println(reservations.containsKey("HY234-9234"));
        System.out.println(reservations.containsKey("AAI-123"));
        System.out.println(reservations.containsKey("Jerry"));*/

        String name = reservations.get("HY234-4235");
        System.out.println(name);

        String anotherName = reservations.get("AAI165-3456");
        System.out.println(anotherName);





    }
}
