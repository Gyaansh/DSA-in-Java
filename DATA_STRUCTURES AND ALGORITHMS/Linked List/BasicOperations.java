
class BasicOperations {

    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

    public static void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.err.println();
    }

    public static void insertAtMiddle(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (temp == null || idx == 0) {
            insertAtBeginning(data);
            return;
        }
        size++;
        int count = 0;
        while (temp != null && count < idx - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    static int removeFirst() {
        if (size == 0)
            return Integer.MIN_VALUE;
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    static int removeLast() {
        if (size == 0)
            return Integer.MIN_VALUE;
        else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node prev = head;
        int i = 0;
        while (prev != null && i < size - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    static int linearSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    static void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    static void deleteNFromLast(int n) {

        int idx = size - n + 1, i = 1;
        Node temp = head;
        while (temp != null && i < idx) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    static Node findMid() {
        Node fast;
        Node slow = fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean checkPalindrome() { 
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMid();

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right.next != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    static boolean isCycle(){ //Floyd's Cycle Finding Algorithm
        Node fast,slow;
        slow = fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    static void removeCycle(){
        Node fast,slow;
        slow = fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false) return;
        slow = head;
        Node prev = null;
        while(slow!=fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static Node tail;
    public static Node head;
    public static int size;

    public static void main(String[] args) {
        Node ll = new Node(1);
        head = tail = ll;
        // insertAtEnd(2);
        // insertAtEnd(3);
        // insertAtEnd(4);
        // insertAtEnd(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5,head.next);
        
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        printLinkedList();
        
    }
}