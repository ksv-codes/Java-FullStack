package A13FunctionalProgramming.Lecture.LambdaExpressions;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        test.sum(6, 7); 
        test.printString("Keshav Sharma");

        //toPrint ->  System.out.println(toPrint);
        //(a,b) -> return  a+b
        //(a,b) -> {
        //          int sum = a+b;
        //          sout(sum)
        //         }
    }
    private void printString(String toPrint){
        System.out.println(toPrint);
    }
    private int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
