package com.techelevator;

public class Car {

    private int year;
    private String color;

    public Car(int year, String color){

        this.year = year;
        this.color = color;

    }

    public Car( int year ){
        this.year = year;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color ){
        this.color = color ;
    }

    public int getYear() {
        return year;
    }


}

//    private int numberOfWheels;
//    private int numberOfDoors;
//    private String color;

