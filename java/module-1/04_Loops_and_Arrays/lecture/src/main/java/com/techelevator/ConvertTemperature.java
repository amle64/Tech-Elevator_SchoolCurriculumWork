package com.techelevator;

public class ConvertTemperature {

    public static void main(String[] args) {
        convertFarenheitToCelsius(98.6);
        convertFarenheitToCelsius(42.0);
        convertFarenheitToCelsius(70.1);

        System.out.println("This is my second call:");
        convertFarenheitToCelsius2(98.6);
        double retTemp = convertFarenheitToCelsius2(98.6);

    }
    public static void convertFarenheitToCelsius(double tempInF) {
        double tempInc = (tempInF - 32.0) * (5 / 9.0);
        System.out.println(tempInF + ", " + tempInc);

    }

    public static double convertFarenheitToCelsius2(double tempInF) {
        double tempInc = (tempInF - 32.0) * (5 / 9.0);
        //double tempInc = convertFarenheitToCelsius(tempInF);
        return tempInc;

    }
}

