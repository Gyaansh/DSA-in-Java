import java.util.Stack;

public class TwoStacks {
    public static class SpecialQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void add(int e) {
            if (s1.isEmpty()) {
                s1.push(e);
                return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(e);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.pop();
        }
        int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.peek();
        }
        boolean isEmpty(){
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {
        SpecialQueue q = new SpecialQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
