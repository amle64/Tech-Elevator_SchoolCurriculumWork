package practice;

public class Car extends Vehicle {

    public Car(double engineSize, String bodyColor){
        super(engineSize, bodyColor);
    }
    public Car(double engineSize){
        super(engineSize);
    }
    public void report() {
        setNumberOfWheels(4);
        System.out.println(getNumberOfWheels());
        System.out.println();
    }
}
