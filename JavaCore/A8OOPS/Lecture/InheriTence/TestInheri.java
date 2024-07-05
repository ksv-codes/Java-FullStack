package Lecture.InheriTence;

public class TestInheri {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());//hashcode in hex
        System.out.println(vehicle.hashCode());//hashcode in decimal
        System.out.println(vehicle.getClass());
        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();
        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();//2 tyres already set hain
        motor.start();
    }
}
