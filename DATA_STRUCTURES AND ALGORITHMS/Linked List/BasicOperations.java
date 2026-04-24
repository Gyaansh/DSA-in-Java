class BasicOperations {

    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        while(prev != null && i < size - 1){
            prev = prev.next;
            i++;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    static int linearSearch(int key){
        Node temp = head;
        int idx=0;
        while(temp != null){
            if(temp.data == key)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    public static Node tail;
    public static Node head;
    public static int size;
    
    public static void main(String[] args) {
        Node ll = new Node(1);
        head = tail = ll;
        insertAtEnd(3);
        insertAtEnd(4);
        printLinkedList();
        insertAtMiddle(1, 2);
        printLinkedList();
        // removeFirst();
        removeLast();
        printLinkedList();
        System.out.println(linearSearch(7));

    }
}