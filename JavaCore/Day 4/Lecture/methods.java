package A5LoopsMethod.Lecture;

public class methods {
    public static void main(String[] args) {
        wish();//invokation of method
        int a =5;
        int b = 6;
        System.out.println("Sum is"+" "+sumTwo(a,b));
        methods meth = new methods();//creation of object in case of non static methods
        System.out.println(meth.diff(a, b));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static int sumTwo(int a , int b){
        return a+b;
    }
    public int diff(int a,int b){
        return a-b;
    }
    public static void wish(){
        System.out.println("Welcome Home");
    }

}
