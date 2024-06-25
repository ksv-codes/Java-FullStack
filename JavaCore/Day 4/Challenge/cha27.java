package A4OperatorsIfelseNoSys.Challenge;

import java.util.Scanner;

public class cha27 {
    //even me rightmost bit is 0 and odd me rightmost 1 hain
    //num%1==0 ODD (yeh krne se just rightmost bit hi significant reh jaegi)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if ((num&1)==1) {//making only rightmost bit significant
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
    
}
