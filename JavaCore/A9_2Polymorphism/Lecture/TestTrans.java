package A9_2Polymorphism.Lecture;

public class TestTrans {
    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle v = new Vehicle(); Vehicle is a iterface
        Plane p = new Plane();
        //castTest(v);
        castTest(c);//castTest ko ek vehicle chaiye ya toh vehicle ka object dal so ya vehicle ke kisi child jase ki car ka object daldo bcz eventually hain toh car bhi ek Vehicle hi
        castTest(p);
        //Vehicle vCar = new Car();//Upcasting is allowed
        //Car cVeh = (Car) new Vehicle();//Downloasting is not allowed but jabardasti krwa skte hain

        //Object ref = new Vehicle();//Object class ke refrence me sb dal jaenge
    }
    private static void castTest(Vehicle veh){
        //Car cVeh = (Car) veh;//yha hme pta hain castTest me car ka hi object aa rha hain jo ki veh reference me hain toh usko explicity car ke refernce me dal skte hain
        int a = ((Car) veh).noOfDoors();
        System.out.println(a);
        veh.start();
       if (veh instanceof Car) {
        
       }
    }
}
