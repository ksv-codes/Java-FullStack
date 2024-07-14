package Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import A12MTnES.Lecture.Runnable.PrintTask;
 public class TestSingleExe {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();//static builders hain so dont need to create objects by new
        //creates a executor service that have only a single thread in its pool
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('$');
        PrintTask task3 = new PrintTask('%');
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);//a single thread executed them one by one
        service.shutdown();
    }
}
 