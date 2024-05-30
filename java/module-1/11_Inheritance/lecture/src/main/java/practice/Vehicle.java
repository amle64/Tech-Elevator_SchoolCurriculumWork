package practice;

public class Vehicle {
    private int numberOfWheels;
    private double engineSize;
    private String bodyColor;

    public Vehicle(double engineSize, String bodyColor){
        this.engineSize = engineSize;
        this.bodyColor = bodyColor;
    }

    public Vehicle(double engineSize){
        this.engineSize = engineSize;
    }

    public Vehicle(String bodyColor){
        this.bodyColor = bodyColor;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;

    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;

    }
}
