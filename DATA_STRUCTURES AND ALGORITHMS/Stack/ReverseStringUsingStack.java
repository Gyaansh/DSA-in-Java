import java.util.*;
public class ReverseStringUsingStack {
    void reverse(Stack<Character> stack, StringBuilder str){
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        for (int i = 0; i < str.length(); i++) {
            str.setCharAt(i, stack.pop());
        }
    }
    void main(){
        StringBuilder str = new StringBuilder("Abra Ka Dabra");
        Stack<Character> stack = new Stack<>();
        reverse(stack, str);
        System.out.println(str.toString());
    }
}
