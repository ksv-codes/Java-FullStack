package A4OperatorsIfelseNoSys.Challenge;

import java.util.Scanner;

public class cha16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd Even Checker");
        System.out.println("Enter the number");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
