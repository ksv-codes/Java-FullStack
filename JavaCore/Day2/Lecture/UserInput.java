package A3DataTypesVarInp.Lecture;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();//only consume the interget not the newline in the input buffer
            System.out.println(a);
            input.nextLine();//you can add an extra input.nextLine() after reading the integer to consume the newline characters(all inthe inputbuffer).
            String name = input.nextLine();
            System.out.println("Good Morning "+name);
        }
    }
}
