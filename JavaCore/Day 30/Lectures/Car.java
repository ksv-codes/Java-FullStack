public class Car {
    static int noOfCarsSold = 0;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currenFuelinLiters;
    int noOfSeats;
    Car(String color){//Initialise states 
        this.color = color;
        noOfWheels=4;
        maxSpeed = 150;
        currenFuelinLiters=2;
        noOfSeats=5;
    }

    static{
       noOfCarsSold=0;
       System.out.println("static block");
    }

    {
        noOfCarsSold++;
        System.out.println("INit block");
    }
    Car(){//A class can have multiple constructors(Polymorphism)
        this("Black"); //constructor chaining                                                  // color = "Black";
        //call a constructor that accepts a color                                                   // noOfWheels=4;
        currenFuelinLiters=5;}                                                                      // maxSpeed = 150;
                                                                                                    // currenFuelinLiters=4;
                                                                                                // noOfSeats=5;
                                                                            
        
    public Car start(){
        if (currenFuelinLiters==0) {
            System.out.println("Car is out of Fuel, can not start");
        }
        else if (currenFuelinLiters<5) {
            System.out.println("Car is in reserved mode Please refuel");
        }
        else{
            System.out.println("Car is Started....bruhhh");
        }
        return this; 
    }

    public void drive(){
        System.out.println("Car is Driving");
        currenFuelinLiters--;
        
    }
    public void addFuel(float currenFuelinLiters){
        this.currenFuelinLiters=currenFuelinLiters;
    }
    public float getCurrentFuelLevel(){
        return currenFuelinLiters;
    }

    public static void main(String[] args) {
        //new Car();        //a object is created without reference
         
    } 
}