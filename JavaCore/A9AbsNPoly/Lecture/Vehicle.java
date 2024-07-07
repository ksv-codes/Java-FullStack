package A9AbsNPoly.Lecture;

public abstract class Vehicle implements Transport{ //can't be instatiated means iska object nhi bnaya ja skta
    private int noOfTyres;
    public abstract void makeStartSound();//abstract method is a responsibility of child to define it hence iski body parent me nhi di jati
    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public int getNoOfTyres() {
        return noOfTyres;
    }
    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public void commute(){
        System.out.println("Going....");
    }
    @Override 
    public void getSetGo() {//ek abstract class chahe toh (not compulsary) apne parent ki abstract method(responsibility) ko define kr skta hain
        System.out.println("Chalo bc!!");
    }   
}
