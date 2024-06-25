package A4OperatorsIfelseNoSys.Lecture;

import java.util.Scanner;

public class LogoOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ticket Discount");
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        System.out.print("Are you a Female? (true/false)");
        boolean isFemale = input.nextBoolean();
        if (age<5) {
            System.out.println("75%");
        }
        else if (isFemale) {
            System.out.println("50%");
        }
        else if (age>60 && !isFemale) {
            System.out.println("25%");
        }
        else{
            System.out.println("0%");
        }
    }
}
