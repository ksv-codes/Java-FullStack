package A9_2Polymorphism.Lecture;
public class OverLoading {
    OverLoading(){
        System.out.println("Default Constructor called");
    }
    OverLoading(String pop){
        System.out.println(pop);
    }
    public int add(int a , int b){
        return a + b;
    }
    public int add(int a , int b , int c , int d){
        return a+b+c+d;
    }
    public String add(String a , String b){
        return a+b;
    }
    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        int sum = ol.add(3, 4);
        ol.add("Keshav", "Tanuja");
        System.out.println(ol.add(4,sum));
        System.out.println();
        System.out.println("Second Constructor");
        OverLoading ol2 = new OverLoading("Keshav Sharma");
        System.out.println(ol2.add(3, 4));
    }
}
