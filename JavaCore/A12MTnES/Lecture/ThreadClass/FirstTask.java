package A12MTnES.Lecture.ThreadClass;

public class FirstTask extends Thread {
    @Override
    public void run() {
        //FirstTask
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s * Task Completed",Thread.currentThread().getName());
        System.out.println();
    }
}
