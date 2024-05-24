package com.techelevator;

public class Car {

    private int year;
    private String color;

    public Car(int year,String color){
        this.year = year;
        this.color = color;

    }

    private int numberOfWheels;

    private int numberOfDoors;



    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
