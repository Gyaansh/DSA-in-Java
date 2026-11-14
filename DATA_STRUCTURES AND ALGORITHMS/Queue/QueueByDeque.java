import java.util.Deque;
import java.util.LinkedList;
public class QueueByDeque {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();
        void push(int e){
            dq.addLast(e);
        }
        int pop(){
            return dq.removeFirst();
        }
        int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 3; i++) {
            System.out.print(s.pop() + " ");
        }
    }
}
