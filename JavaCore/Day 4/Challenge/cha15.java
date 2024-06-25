package A4OperatorsIfelseNoSys.Challenge;

import java.util.Scanner;

public class cha15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocome to number Checker");
        System.out.println("enter the number");
        int num = input.nextInt();
        if (num>0) {
            System.out.println("Positive");
        }
        else if (num==0) {
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
