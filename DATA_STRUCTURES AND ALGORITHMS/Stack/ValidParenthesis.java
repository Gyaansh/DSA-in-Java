import java.util.Stack;
public class ValidParenthesis{
    static boolean validateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if("({[".indexOf(curr) != -1){ //opening bracket
                stack.push(curr);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((top == '(' && curr == ')') ||
                    (top == '[' && curr ==']') ||
                    (top == '{' && curr == '}')){
                        stack.pop();
                    }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String a = "({}[][{()}])";
        System.out.println(validateParenthesis(a));
    }
}