package Executor;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        //PrintTask
        for (int i = 1; i <=100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
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
