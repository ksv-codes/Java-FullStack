package A9AbsNPoly.Lecture;

public class TestAbs {
    public static void main(String[] args) {
        //Vehicle veh = new Vehicle(2);     //We don't want ki yeh object bne thats why hum Vehicle ko abstract bnaenge
        Car car = new Car();
        System.out.println(car.getNoOfTyres());//NoofTyres is private hence getter se get kr rhe hain
        car.commute();//Use ab bhi kr paa rhe hain Parent ke methods ko Parent ka object bnae but through the child class
        car.makeStartSound();
        
    }
}
