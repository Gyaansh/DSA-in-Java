import java.util.LinkedList;
import java.util.Stack;
public class PalindromeLinkedlist {
    static boolean isPalindrome(LinkedList<Character> ll){
        Stack<Character> s = new Stack<>();
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            s.push(ll.get(i));
        }
        for (int i = 0; i < size; i++) {
            if(ll.get(i) != s.peek()){
                return false;
            }
            s.pop();
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        // ll.add('C');
        ll.add('B');
        ll.add('A');
        System.out.println(isPalindrome(ll));
    }
}
