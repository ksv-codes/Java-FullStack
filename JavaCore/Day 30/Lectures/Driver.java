public class Driver {
    static int minAge=18;
    String name;
    String dateOfLicense;
    int age;
    public boolean isAllowed(){
        return this.age >= minAge;//static field can be used in non static part
    }
   public static void main(String[] args) {
        // Car myCar = new Car(); //so it means Scanner bhi ek class hain jiske hum input naam ka object bnate h to use its methods(nextInt(),next())
        //myCar.noOfSeats=2;
        // System.out.println(myCar.noOfSeats);
        // myCar.drive();
        // myCar.addFuel(6);
        // System.out.println(myCar.currenFuelinLiters);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // System.out.println(myCar.currenFuelinLiters);
        // myCar.addFuel(3);
        // myCar.drive();

        Car Swift = new Car("red");
        Car thar = new Car();
        Swift.addFuel(6);
        //Car startedCar = Swift.start();//Swift.start ne Swift ko return kiya jo ab startedCar bn chuki hian aur ab hum Swift ke sare methods started Car ke through use kr skte h 
        Swift.start().drive();//startedCar.drive();
        System.out.println(Swift.color);

        Driver myDriver = new Driver();
        myDriver.dateOfLicense="1/Jan/2024";//dateOfLicense is non static toh object k through hi use kr skte hain
        System.out.println(minAge);//minAge is static toh seedha access kr liya
        System.out.println(myDriver.minAge);//allowed hain but not recommended kesha
    }
}
