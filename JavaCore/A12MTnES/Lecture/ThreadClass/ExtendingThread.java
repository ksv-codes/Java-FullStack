package A12MTnES.Lecture.ThreadClass;

public class ExtendingThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("\n Starting First Thread");
        t1.start();//start is a method of Thread class jo ab each first,second,third class me aa chuka hain bcz each class have extended the thread class
        System.out.println("\n Starting Second Thread");
        t2.start();
        System.out.println("\n Starting Third Thread");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s Total Time Taken:  %d",Thread.currentThread().getName(),(endTime-startTime));
    }
}
