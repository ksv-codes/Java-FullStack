package Lecture.KnowledgeGate;

import Lecture.KgCoding.*;

public class DefTest {
    final int a=5;//cant changed in constructor
    int b=7;//can change in consturctor
    

    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }


    public DefTest(int b) {
        this.b = b;
    }


    public static void main(String[] args) {
        Car car = new Car("yellow", "Dezire", 5, 3000);
        System.out.println(car.model);//accessible in other package as defined public
        //System.out.println(car.fuelLevel);   NOT ACCESSIBLE AS DEFINED DEFAULT

        //Def d = new Def(); CANT ACCESS AS DEF IS A DEFAULT CLASS

        DefTest D = new DefTest(5);
        System.out.println(D.b);
        System.out.println(D.a);
        System.out.println(D.getA());
    }   
}
