package A10ExceptionNFile.Challenge;

import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("please Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException  e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occured");
            } else {
                throw e;
            }
        }
    }
}
