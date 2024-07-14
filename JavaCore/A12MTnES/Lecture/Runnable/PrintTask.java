package A12MTnES.Lecture.Runnable;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        //PrintTask
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d%c ", i,targetChar);
        }
        System.out.printf("\n %s %c Task Completed",Thread.currentThread().getName(),targetChar);
        System.out.println();
    }
    private final char targetChar;
    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    
}
