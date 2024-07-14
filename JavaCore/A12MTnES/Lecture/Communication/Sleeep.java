package A12MTnES.Lecture.Communication;

public class Sleeep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("before sleep");
        Thread.sleep(5000);//static method(jis thread se call krenge (main) usko hi sula dega)
        System.out.println("Woke UP");
    }
}
