package seven.lecture;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in))  {
            int a = input.nextInt();
             int b = input.nextInt();
             if (a>b) {
                System.out.println(a+" A is greater number");
             }
             else{
                System.out.println(b+" B is greater number");
             }

             String statement = a>b?"a is greater":"b is greater";
             System.out.println(statement);
        }

    }
}
