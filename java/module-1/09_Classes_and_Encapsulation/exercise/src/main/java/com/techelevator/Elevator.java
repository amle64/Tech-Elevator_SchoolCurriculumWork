package com.techelevator;

public class Elevator {
    private int currentFloor=1;

    private int numberOfFloors;

    private boolean isDoorOpen;

    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }

    public void openDoor(){
        isDoorOpen = true;
    }

    public void closeDoor(){
        isDoorOpen = false;
    }

    public void goUp(int desiredFloor){
        if (isDoorOpen==false&&desiredFloor>=numberOfFloors){
            currentFloor = numberOfFloors;
        } else if(isDoorOpen==false&&desiredFloor>currentFloor){
            currentFloor = desiredFloor;
        } else if (isDoorOpen==false&&desiredFloor<currentFloor){
            return;
        }
    }

    public void goDown(int desiredFloor){

        if(desiredFloor<1){
            return;
        }
        else if(isDoorOpen==false&&desiredFloor<currentFloor){
            currentFloor = desiredFloor;
        }else if (isDoorOpen==false&&desiredFloor>currentFloor){
            return;
        }


    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }
}
