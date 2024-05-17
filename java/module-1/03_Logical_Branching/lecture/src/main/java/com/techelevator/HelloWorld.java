package com.techelevator;

public class HelloWorld{

    public static void main(String[] args){
        convertFahToCelsius(98.6);
        convertFahToCelsius(42.0);
        convertFahToCelsius(70.1);

    }

    public static void convertFahToCelsius(double tempInF) {
        double tempInC = (tempInF-32.0)*(5/9.0);
        System.out.println(tempInF + ", " + tempInC);;
    }

}