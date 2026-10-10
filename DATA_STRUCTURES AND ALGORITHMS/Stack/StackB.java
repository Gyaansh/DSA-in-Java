import java.util.ArrayList;

public class StackB{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        static void push(int e){
            list.add(e);
        }
        static int pop(){
            if(list.size() == 0) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        static int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.err.println(s.peek());
            s.pop();
        }
        System.err.println(s.pop());
    }
}