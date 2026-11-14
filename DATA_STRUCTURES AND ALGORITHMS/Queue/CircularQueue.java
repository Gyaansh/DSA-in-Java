public class CircularQueue {
    static class Circular_Queue {
        int[] arr;
        int size;
        int rear, front;

        Circular_Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add(int e) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1)
                front = 0; // add first element

            rear = (rear + 1) % size;
            arr[rear] = e;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int pop = arr[front];
            
            if(rear == front)
                rear = front = -1;
            else
                front = (front + 1) % size;
            return pop;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
    }

    void main() {
        Circular_Queue q = new Circular_Queue(3);
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
}
