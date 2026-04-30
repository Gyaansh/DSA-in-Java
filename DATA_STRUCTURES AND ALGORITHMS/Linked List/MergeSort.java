public class MergeSort {
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

    public static Node getMid(Node head){
        Node slow,fast;
        slow = head;
        fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Node sort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = sort(head);//Left half
        Node newRight = sort(rightHead);
        
        return merge(newLeft, newRight);
    }
    public static Node merge(Node left, Node right){
        Node mergeList = new Node(Integer.MIN_VALUE);
        Node temp = mergeList;
        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;   //link node after temp
                left = left.next;   //Increment left
            } else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;   //Increment temp
        }
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergeList.next;
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

    public static Node tail;
    public static Node head;
    public static int size;


    public static void main(String[] args) {
        Node list = new Node(2);
        head = tail = list;
        insertAtEnd(5);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(4);
        insertAtEnd(2);
        printLinkedList();
        head = sort(list);
        printLinkedList();
    }
}
