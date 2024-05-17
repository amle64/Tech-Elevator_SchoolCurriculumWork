package com.techelevator;

public class HWTEST {
    public static void main(String[] args) {
        /*Running isStoreOpen(7, 'M', true). *** Test failed. ***
        Expected value: false
        Actual value: true
        Running isStoreOpen(7, 'F', true). *** Test failed. ****/
        isStoreOpen(7, 'M', true);
    }
    public static boolean isStoreOpen(int currentHour, char currentDay, boolean isSummer) {
        boolean open = true;
        if (isSummer == true){
            if (currentDay == 'W' || currentDay == 'S'){
                if (currentHour >= 8 && currentHour <20){
                    open = true;
                }
                else {
                    open = false;
                }
            } else {
                open = false;
            }
        } else if (!isSummer){
            if (currentDay == 'M' || currentDay == 'W' || currentDay == 'F'){
                if (currentHour>=8 && currentHour <17){
                    open = true;
                }
                else {
                    open = false;
                }
            }
            else {
                open = false;
            }
        }
        System.out.println(open);
        return open;
    }


}
