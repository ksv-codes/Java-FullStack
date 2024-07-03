package seven.lecture;

import java.util.Scanner;

public class dsm {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            String c = input.nextLine();
            int b = input.nextInt();
            String d = input.nextLine();//will take enter(next line from the input buffer)
      System.out.println(a+b+c+d);
        }
    }
}
