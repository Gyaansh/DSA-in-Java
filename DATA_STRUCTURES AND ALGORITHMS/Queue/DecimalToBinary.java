import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class DecimalToBinary {
    public static void printBinary(int n) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            int curr = i;
            while (curr > 0) {
                int bin = curr % 2;
                curr /= 2;
                q.addLast(bin);
            }
            while (!q.isEmpty()) {
                System.out.print(q.removeLast());
            }
            System.out.print(' ');
        }
    }

    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            
            System.out.println(s1);
            
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        // printBinary(a);
        generatePrintBinary(a);
    }
}