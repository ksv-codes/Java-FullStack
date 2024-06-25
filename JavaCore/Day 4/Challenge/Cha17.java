package A4OperatorsIfelseNoSys.Challenge;

import java.util.Scanner;

public class Cha17 {
    public static void main(String[] args) {
        System.out.println("Greatest of 3 number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>=b && a>=c) {
            System.out.println("a is greatest");
        }
        else if (b>c) {
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
    }
}
