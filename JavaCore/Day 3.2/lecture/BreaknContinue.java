package seven.lecture;

public class BreaknContinue {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++) {
            if (i==5) {
                break;//seedha loop todo
            }
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i<=10; i++) {
            if (i==5) {
                continue;//bss 101 ko nhi krna print aage ke krdo
            }   //go to Updation(skip one iteration)
            System.out.print(i+" ");
        }
    }
}
