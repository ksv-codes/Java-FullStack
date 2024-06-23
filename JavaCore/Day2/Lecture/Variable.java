package A3DataTypesVarInp.Lecture;

public class Variable {
    public static void main(String[] args) {
        int myNumber=865;//declaration and initialization
        int a;//declaration
        a=65; //initialization
        System.out.println(a+" "+myNumber);
        a=56;//updation
        boolean isMale=true;
        System.out.println(isMale);
        float f=5;
        float F=5.0f;//just 5.0 ko yeh as a double treat krta hain jisko float me nhi dal skta toh btana pdta hian ki yeh float jitna chota decomal hi hian f lga kr
        float g = (float)5.0;//typecasting
        System.out.println(f+" "+g+" "+F);
        String wishes = "Good Morning";
        System.out.println(wishes);
        char h = 'a';
        System.out.println(h);
    }
}
