import java.util.Stack;

public class decodeString {

    static String decode(String str) {
        Stack<Integer> intStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        int count = 0;
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && i < str.length()) {
                int num = 0;
                while (Character.isDigit(str.charAt(i))) {
                    num = num * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                intStack.push(num);
            } else if (str.charAt(i) == '[') {
                while (str.charAt(i) != ']' && !Character.isDigit(str.charAt(i))) {
                    charStack.push(str.charAt(i));
                    i++;
                }
                i--;
            } else if (str.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder("");
                while (!charStack.isEmpty() && charStack.peek() != '[') {
                    temp.insert(0, charStack.pop());
                }
                // if(!charStack.isEmpty())
                    charStack.pop();
                String temp2 = temp.toString().repeat(intStack.pop());
                for (int index = 0; index < temp2.length(); index++) { //pushing replicated chars back to stack
                    charStack.push(temp2.charAt(index));
                }
            }
            else{
                charStack.push(str.charAt(i));
            }
        }
        while(!charStack.isEmpty()){
            result.insert(0,charStack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "a3[b2[ca]]";
        System.out.println(decode(str));
    }
}