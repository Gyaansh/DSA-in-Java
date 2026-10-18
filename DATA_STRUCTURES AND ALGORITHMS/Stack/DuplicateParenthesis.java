import java.util.Stack;
public class DuplicateParenthesis {
    static boolean checkDuplcateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ')'){
                stack.push(str.charAt(i));
            }
            else{
                int popCount = 0;
                while( stack.peek()!='('){
                    popCount++;
                    stack.pop();
                }
                // if(!stack.isEmpty())
                    stack.pop();
                if(0==popCount){
                    return true;
                }

            }
        }
        if(stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "((a+b) + (c))";
        System.out.println(checkDuplcateParenthesis(str));
    }
}
