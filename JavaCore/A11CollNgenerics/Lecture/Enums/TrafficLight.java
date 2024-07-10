package A11CollNgenerics.Lecture.Enums;

public enum TrafficLight {//These three are the OBJECTS of TrafficLight
    RED("Stop"),GREEN("Go"),YELLOW("wait");  //Traffic lights ki sirf yhi 3 values ho skti hian
    //When you define an enum constant (e.g., RED), the constructor associated with that constant is called.
    private final String action;

    private TrafficLight(String action) {
        this.action = action;
    } //Yeh Traffic light ka constructor hain jo bolra hain ki agr iska object(RED,GREEN,Yellow in thsi case) to usme action define krna padega
    
}

//So here RED , GREEN ,YELLOW are the objects of the enum  TrafficLight and these is a constructor defined that ask for a String action to create the Objects thats why we are giving thr Action in the the colors that are objects like we need to have the paramaters in the constructors to create a object
