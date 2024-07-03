package seven.lecture;

public class recursion {
    public static void main(String[] args) {
        int a = (int)factotial(5);
        System.out.println(a);
        //System.out.println(Math.sin());
    }

    private static long factotial(int i) {
        if(i==0){
            return 1;
        }

       return i*factotial(i-1);
    }
}
