public class ZigZag {
    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    static Node findMid() {
        Node fast;
        Node slow = head;
        fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void zigZagList() {
        
        //Break LL in 2 parts
        Node mid = findMid(); 
        Node curr = mid.next; 
        mid .next = null; 
        Node prev = null;
        Node next;


        // Reverse 2nd part 
        while(null != curr){
            next = curr.next;
            curr.next = prev;
            prev = curr;    // Prev points to curr
            curr = next;    // Curr points to prev
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;


        //Alternate merge - Zig-Zag fashion
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
        
        
    }

    public static void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.err.println();
    }

    public static Node tail;
    public static Node head;
    public static int size;

    public static void main(String[] args) {
        Node ll = new Node(1);
        head = tail = ll;
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);
        printLinkedList();
        zigZagList();
        printLinkedList();
    }
}
