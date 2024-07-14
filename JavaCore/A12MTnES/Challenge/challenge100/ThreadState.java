package A12MTnES.Challenge.challenge100;
public class ThreadState extends Thread{
   @Override
   public void run() {
       try {
        Thread.sleep(4000);
        System.out.printf("",Thread.currentThread().getState());
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
   }
    
}
