package A4OperatorsIfelseNoSys.Lecture;

import java.util.Scanner;

public class RelaOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcomr to Driving License Portal");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age>=18) {
            System.out.println("Eligible to Drive");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
