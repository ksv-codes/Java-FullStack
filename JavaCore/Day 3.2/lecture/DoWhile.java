package seven.lecture;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Keshav Sharma");
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            while (age<0||age>100) {
                age = input.nextInt();
            }
            System.out.println(age);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Keshav Sharma");
        }
    }
}
