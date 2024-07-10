package A11CollNgenerics.Lecture.B3CollectionsLib;
import java.util.LinkedList;
import java.util.Queue;
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.offer(2);
        System.out.println(qu.peek());
        System.out.println(qu.element());
        Utility.print(qu);//Child of collection interface E==Integer
        System.out.println(qu.poll());
    }
}
