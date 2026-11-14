import java.util.*;
public class LinkedListQueue {
    static class Node{
        int data;
        Node next;
        Node(int e){
            this.data = e;
            this.next = null;
        }
    }
    // static class Queue{
        int size;
        Node head = null;
        Node tail = null;
        
        boolean isEmpty(){
            return head == null && tail == null;
        }
        void add(int e){
            Node newNode = new Node(e);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int res = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return res;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
    }
    void main(){
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

