import java.util.Stack;

void pushAtBottom(Stack<Integer> stack, int el){
    if(stack.isEmpty()){
        stack.push(el);
        return;
    }
    int top = stack.pop();
    pushAtBottom(stack, el);
    stack.push(top);
}

void main(){
    Stack<Integer> s = new Stack<>();
    s.push(2);
    s.push(3);
    s.push(4);
    for (Integer i : s) {
        System.out.println(i);
    }
    pushAtBottom(s,1);
    for (Integer i : s) {
        System.out.println(i);
    }
}