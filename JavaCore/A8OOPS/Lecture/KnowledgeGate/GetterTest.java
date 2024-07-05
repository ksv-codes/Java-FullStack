package Lecture.KnowledgeGate;

import Lecture.GetterNSetter.Car;

public class GetterTest {
    
    public static void main(String[] args) {
        Car car = new Car("Red", "Maruti", 3, 8000);
        System.out.printf("%s %s",car.getcolor(),car.getmodel());
        //car.model="BMW"; dekho ab hum getter ke thorugh print ya dekh toh skte hai but kyuki model private hain toh change nhi kr skte
        //car.setColor(); can acess as default hain dusre package me nhi chalega
        

    }
}
