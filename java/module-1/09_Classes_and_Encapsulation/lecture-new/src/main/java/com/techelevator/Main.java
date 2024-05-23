package com.techelevator;

public class Main {
    public static void main(String[] args) {

        Main testMain = new Main();
        testMain.testStatic();

        //testStatic();

        //Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(30);
        rectangle.setWidth(20);
        System.out.println("The area of this rectangle is: " + rectangle.getArea());

        //Person
        //Person person = new Person("John Smith", "123456789");

        //System.out.println(person.getName() + ": " + person.getSsn());


        //Car examples
        Car[] cars = new Car[3];

        cars[0] = new Car(2023,"Red");

        cars[1] = new Car(2024);

        cars[2] = new Car(2025,"Blue");


        for (Car car: cars) {
            System.out.print(car.getYear() + ": ");
            System.out.println(car.getColor());

        }

        //after a month
        System.out.println("Setting the color of cars[1] to Pink:");
        cars[1].setColor("Pink");

        for (Car car: cars) {
            System.out.print(car.getYear() + ": ");
            System.out.println(car.getColor());

        }

//        cars[0].setYear(2025);
//
//        System.out.println("Setting the year of cars[0] to 2025:");
//        for (Car car: cars) {
//            System.out.print(car.getYear() + ": ");
//            System.out.println(car.getColor());
//
//        }



        //Car example
//        Car car = new Car();
//        car.setYear(2023);
//
//        System.out.println(car.getYear());

    }

    public void testStatic() {
        System.out.println("Hello World, testing static");
    }
}