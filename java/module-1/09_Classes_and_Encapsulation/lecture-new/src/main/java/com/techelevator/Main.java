package com.techelevator;

public class Main {
    public static void main(String[] args) {
        //Rectangle

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(30);
        rectangle.setWidth(20);
        System.out.println("The area of this rectangle is: "+rectangle.getArea());






        Person[] person = new Person[3];
        person[0] = new Person("John Smith","124456");

        System.out.println(person[0].getName()+"   "+person[0].getSsn());
        Car[] cars = new Car[3];

        cars[0] = new Car(2023,"Silver");
        cars[1] = new Car(2024, null );
        cars[2] = new Car(2025, "Black");

        /*cars[0] = new Car();
        cars[0].setYear(2023);

        cars[1] = new Car();
        cars[1].setYear(2024);

        cars[2] = new Car();
        cars[2].setYear(2025);*/

        for (Car car:cars){
            System.out.println("Year: "+car.getYear()+"Color: "+car.getColor());
        }

        //Car example
        /*Car car = new Car();
        car.setYear(2023);

        System.out.println(car.);*/
    }
}