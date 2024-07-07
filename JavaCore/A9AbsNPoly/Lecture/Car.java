package A9AbsNPoly.Lecture;

public class Car extends Vehicle{
    private int noOfDoors;
    public Car() {//har constructor ko parent ka constructor call krna padta hain 
        super(4);
    }
    public int getNoOfDoors() {
        return noOfDoors;
    }
    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    @Override
    public void makeStartSound() {
        System.out.println("Carrrahhahah");
    }
    
    
}
