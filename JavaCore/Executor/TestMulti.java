package Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import A12MTnES.Lecture.Runnable.PrintTask;
 public class TestMulti {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);//static builders hain so dont need to create objects by new
        //creates a executor service that have only a single thread in its pool
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char)i);
            service.submit(task);
        }
        service.shutdown();
        System.out.println("Keshav");
        if (!service.awaitTermination(10,TimeUnit.SECONDS)) {
            System.out.println("Keshav2");
            service.shutdownNow();
        }

    }
}