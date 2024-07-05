package Lecture.GetterNSetter;

import A5LoopsMethod.Lecture.returns;

public class Car {
    private String color; // public
    private String model; // public
    private double fuelLevel;
    private long cost; //default

    
    public Car(String color, String model, double fuelLevel, long cost) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }
    public String getcolor(){
        return color;   //this is not Cyapa bcz smjh ab yeh just color ko dekh skta hain agr hum color variable ko hi public kr dete toh change bhi kr skta hain 
    }
    public String getmodel(){
        return model;
    }
    void setColor(String color) {
        this.color = color;//color change bhi sirf package wali classes hi kr skti hain
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    
}
