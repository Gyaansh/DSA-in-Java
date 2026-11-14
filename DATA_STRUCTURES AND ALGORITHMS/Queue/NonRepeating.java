import java.util.*;

public class NonRepeating {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        StringBuilder str = new StringBuilder("aabccxb");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (!q.isEmpty())
                System.out.print(q.peek() + " ");
            else
                System.out.print(-1 + " ");
        }
    }
}
