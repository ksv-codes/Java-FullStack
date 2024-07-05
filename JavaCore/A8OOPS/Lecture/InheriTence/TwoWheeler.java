package Lecture.InheriTence;

public class TwoWheeler extends Vehicle {
    TwoWheeler(){//constructor
        setnoOfTyres(2);//kuch values pehle se hi define krne ke liye at the time of creation of object
        noOfTyres=4;//protected defined hain
    }
    public void balance(){
        System.out.println("I am Balancing on two tyres");
    }
}
