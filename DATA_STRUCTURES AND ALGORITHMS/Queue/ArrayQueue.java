class ArrayQueue{
    static class Queue{
        int[] arr;
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        boolean isEmpty(){
            return rear==-1;
        }
        void add(int e){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = e;
        }
        int remove(){
            if(rear == -1){
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[0];
        }
    }
    void main(){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}