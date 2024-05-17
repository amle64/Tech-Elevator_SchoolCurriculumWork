package com.techelevator;

public class TestStringArray1 {

    public final static char SMALL_TSHIRT = 'S';
    public final static char MEDIUM_TSHIRT = 'M';
    public final static char LARGE_TSHIRT = 'L';

    public static void main(String[] args) {
        fixTemperatures(new int[] {33, 30, 32, 37, 44, 31, 41});

    }

    public static int[] fixTemperatures(int[] temperatures) {
        int[] correctTemps = new int [temperatures.length];
        //int count = 0;

        //For empty arrays
        if(temperatures.length==0){
            return temperatures;
        }

        for (int i = 0; i < temperatures.length; i++) {

            int remainder = (i+2)%2;
            //If remainder == 0, then we start at index 1 and alternate after 2 indexes (even numbers)
            if (remainder==0){
                correctTemps[i] = temperatures[i]+2;
            }
            //When index is an odd number
            else {
                correctTemps[i] = temperatures[i];
            }
            //System.out.println("temperature is "+temperatures[i]+"correct temp is "+correctTemps[i]);
        }

        return correctTemps;
    }

}
