package com.techelevator;

public class Rectangle {
<<<<<<< HEAD
    private int length;
    private int width;

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
=======

    private int length;
    private int width;

    private final int testFinal = 10;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;

>>>>>>> 08a4d07b2f0eeed4e09a4a82ef76a39f5ebab465
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
<<<<<<< HEAD
        return length*width;
    }
=======

        return length * width;
    }

>>>>>>> 08a4d07b2f0eeed4e09a4a82ef76a39f5ebab465
}
