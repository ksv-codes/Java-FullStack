package A3DataTypesVarInp.Challenge;

import java.util.Scanner;

public class cha6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the First Number");
            int a= input.nextInt();
            System.out.println("Enter the Second Number");
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
