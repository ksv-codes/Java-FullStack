package A3DataTypesVarInp.Challenge;

import java.util.Scanner;

public class cha5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name = input.nextLine();
            System.out.println("Welcome "+name+" to the KG coding");
        }
    }
}
