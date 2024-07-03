package seven.lecture;

import java.util.Scanner;

public class SwitchS {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your Day on number: ");
            int day = input.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;//(if not used then aage wale sare cases chalne l)
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("thrusday");
                default:
                    break;
            }
        }
    }
}
