package Lecture.InheriTence;

public class Vehicle {
    protected int noOfTyres;//private hua toh child classes bhi access nhi kr skta
    public void commute(){
        System.out.printf("I am going from A to B using %d tyres \n",noOfTyres);
    }
    public void setnoOfTyres(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }
    @Override //parent wale toString() method kijagah mere wali toString method ki defination lelo 
    public String toString() {
        return "Keshav Sharma";
    }
    public static void main(String[] args) {
        
    }

}
