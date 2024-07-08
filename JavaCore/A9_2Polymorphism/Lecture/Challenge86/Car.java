package A9AbsNPoly.Challenge.Challenge86;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();//parent class ke service ko call
        System.out.println("car is getting serviced");
    }
}
