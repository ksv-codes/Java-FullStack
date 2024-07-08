package A10ExceptionNFile.Lecture;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.println("Please Enter yout two number");
        int first = input.nextInt();
        int second = input.nextInt();
        try{
            int[] a = new int[5];
            System.out.printf("result is %d",a[4]);
            int result = first/second;
            System.out.printf("result is %d",result);
        }catch(ArithmeticException exception){// only cacthes Arithmatic exception and its subclasses
        System.out.printf("%s, enter valid values",exception.getMessage());
        }catch(ArrayIndexOutOfBoundsException arrexc){
        System.out.println("Array index out of bound");
        System.out.println(arrexc.getMessage());
        }catch(Throwable th){
            System.out.println("General Exception");
            throw th;
        }finally{
            System.out.println("I am in Finally Block");
        }
        
    }
}
