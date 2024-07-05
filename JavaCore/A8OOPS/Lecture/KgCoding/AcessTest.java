package Lecture.KgCoding;

public class AcessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="red";
        car.model = "swift";
        //car.costOfPurchase=45437;   CANT BE ACCESSED AS ITS PRIVATE
        car.fuelLevel=6;//AS DEFINED DEFAULT TOH PACKAGE KI CLASSES M KR SKTE HAIN
        System.out.println(car);
        Car newCar = new Car("Black", "BMW", 1, 5000);//Constructor k thorugh hum private variable ki values define kr skte hain 
        System.out.println(newCar);
    }
}
