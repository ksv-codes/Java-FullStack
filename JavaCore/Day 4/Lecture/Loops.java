package A5LoopsMethod.Lecture;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int i = 0; //Initialization
        while (i<5) { //CONDITION    
            System.out.println(i+1 +" "+"Jai Ho");//no of times = 5-0(if = is absent)
            i++;//Updation
        }


        int j=500;//I
        while (j>=200) {//C
            System.out.println(j);
            j--;//U
        }

        
        Scanner input = new Scanner(System.in);
        int k=0;//I
        while (k<5) {//C
            int num = input.nextInt();
            System.out.println(num);
            k++;//U
        }

    }
}
