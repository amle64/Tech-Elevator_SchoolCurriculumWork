package practice;

public class Truck extends Vehicle {

    public Truck(double engineSize, String bodyColor){
        super(engineSize, bodyColor);
    }
    public void report(){
        super.setNumberOfWheels(10);
        System.out.println(getNumberOfWheels());
    }
    public Truck(String bodyColor){
        super(bodyColor);
    }
    public void cargoContainer(){
        super.setNumberOfWheels(18);
        System.out.println(getNumberOfWheels());
        System.out.println("a cargo container");
    }
}
