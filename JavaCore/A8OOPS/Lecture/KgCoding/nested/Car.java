package Lecture.KgCoding.nested;

public class Car {
    private int noOfDoors;
    public void repair(){
        Tyre t = new Tyre();
    }
    protected class Tyre {//can be private or protected too
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors = 4;
        }
    }
}
