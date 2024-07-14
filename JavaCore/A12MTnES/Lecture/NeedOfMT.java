package A12MTnES.Lecture;

public class NeedOfMT {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //FirstTask
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * Task Completed");
        System.out.println();
        
        //SecondTask
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ Task Completed");
        System.out.println();
        
        //ThirdTask
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task Completed");
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time Taken: %d",endTime-startTime);
    }
}
