package com.techelevator;

public class RectangleWall extends Wall {

    private String name;
    private String color;

    private int length;
    private int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }


    public RectangleWall(String name, String color, int length, int height){
        super(name,color);
        this.length = length;
        this.height = height;


    }

    public int getArea(){
        return length*height;
    }

    @Override
    public String toString(){
        return super.getName()+" ("+length+"x"+height+") "+"rectangle";
    }
}
