package A9_2Polymorphism.PassBy;
public class TestPassbyVal {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x, y);
        System.out.printf("x=%d", "y=%d",x,y,sum);
    }
    public static int add(int a , int b){
        a+=b;
        return a;
    }
}
