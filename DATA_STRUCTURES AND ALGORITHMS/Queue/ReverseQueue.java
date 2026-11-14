import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 4; i++) {
            q.add(i);
        }
        int size = q.size();
        for (int i = 0; i < size; i++)
            {
                s.push(q.remove());
            }
        for (int i = 0; i < size; i++)
            q.add(s.pop());
        System.out.println(q);        
    }
}