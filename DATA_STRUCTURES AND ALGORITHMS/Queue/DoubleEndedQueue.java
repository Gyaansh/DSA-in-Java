import java.util.Deque;
import java.util.LinkedList;
public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addFirst(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.removeLast();
        // dq.removeFirst();
        // dq.removeAll(dq);
        System.out.println(dq);
    }
}
