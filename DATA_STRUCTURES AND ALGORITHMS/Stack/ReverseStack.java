import java.util.Stack;

public class ReverseStack {
    void pushAtBottom(Stack<Integer> stack, int el) {
        if (stack.isEmpty()) {
            stack.push(el);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, el);
        stack.push(top);
    }

    void printStack(Stack<Integer> s) {
        for (Integer i : s) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

    void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    void main() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        printStack(s);
        reverseStack(s);
        printStack(s);
    }
}
