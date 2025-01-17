package com.techelevator;

public class Exercise05_Weather {

    private final static int FREEZING_TEMPERATURE = 32;

    /*
    GaleForce Meteorologists recently developed a new weather station and need it to perform
    some common measurements for reporting.

    Note: Assume all temperatures are in Fahrenheit (°F) unless otherwise
    noted.
     */

    /*
    GaleForce needs to know the number of days in the upcoming forecast
    where the temperature is at or below freezing.

    Given an array of high temperatures, count the number of days when
    the high temperature is freezing (32° F) or below.

    Examples:
	belowFreezing([33, 30, 32, 37, 44, 31, 41]) → 3
	belowFreezing([-7, -3, 19, 35, 30])  → 4
	belowFreezing([]) → 0
    */
	public int belowFreezing(int[] dailyHighs) {
        int count = 0;
        if (dailyHighs.length==0){
            return count;
        }
        for (int i = 0; i < dailyHighs.length; i++) {
            if(dailyHighs[i]<=32){
                count++;
            }
        }
        return count;
	}

    /*
    GaleForce also needs to determine the hottest day when given an upcoming forecast.

    Given an array of high temperatures, determine the hottest temperature.

    Note: The array of high temperatures is guaranteed to have at least one
    element.

    Examples:
	hottestDay([81, 93, 94, 105, 99, 95, 101, 90, 89, 92]) → 105
	hottestDay([23, 24] → 24
	hottestDay([34, 33] → 34
	hottestDay([55]) → 55
    */
    public int hottestDay(int[] dailyHighs) {
        int highestTemp = 0;
        if (dailyHighs.length==1){
            return highestTemp = dailyHighs[0];
        }
        for (int i = 0; i < dailyHighs.length; i++) {
            if (i==0){
                highestTemp = dailyHighs[i];
            } else if (dailyHighs[i]>highestTemp){
                highestTemp = dailyHighs[i];
            } /*else if (dailyHighs[i]<highestTemp&&dailyHighs.length==i+1){
                return highestTemp
            }*/
        }
        return highestTemp;
    }

    /*
    GaleForce discovered an equipment malfunction. Every other reading, starting with the first,
    was off by 2 degrees Fahrenheit (°F).

    Given an array of Fahrenheit temperatures, fix each of the incorrect readings by adding
    2 degrees to its current value.

    Examples:
	fixTemperatures([33, 30, 32, 37, 44, 31, 41]) → [35, 30, 34, 37, 46, 31, 43]
	fixTemperatures([-7, -33, 19, 35]) → [-5, -33, 21, 35]
	fixTemperatures([-1, 0, 1] → [1, 0, 3]
    fixTemperatures([-1] → [1]
	fixTemperatures([]) → []
     */
    public int[] fixTemperatures(int[] temperatures) {
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
