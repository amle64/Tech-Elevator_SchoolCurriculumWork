package com.techelevator;

public class Rectangle {

    private int length;
    private int width;

    private final int testFinal = 10;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){

        return length * width;
    }

}
