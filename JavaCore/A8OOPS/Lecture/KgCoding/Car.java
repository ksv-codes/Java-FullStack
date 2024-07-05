package Lecture.KgCoding;

public class Car {
    public String color;//can be accessd everywhere even in other packages
    public String model;
    double fuelLevel;
    private long costOfPurchase;//only accessed in this class only
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;//yha access kr skte h
    }
    @Override
    public String toString() {
        return "Car [color=" + color + ", model=" + model + ", fuelLevel=" + fuelLevel + ", costOfPurchase="
                + costOfPurchase + "]";
    }
    public Car(){

    }
    
}
