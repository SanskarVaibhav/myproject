public class T9 {
    static class Queue {
        int[] arr;
        int front;
        int rear;
        int size;
        int count;

        
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
// function to check queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
// function to check queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }
// function to add data inside the queue
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            count++;
        }
// function to remove data from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1; 
            } else {
                front = (front + 1) % size;
            }
            count--;
            return result;
        }
// function to see the data at front
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
// function to create queue is circular
        public void circularqueue(int size){
            this.size = size;
            this.arr = new int[size];
            this.front = 0;
            this.rear = -1;
            this.count = 0;
        }
// function to get the size of the queue
        public int size() {
            return count;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); 
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(5);

        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Front element: " + q.peek());

        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(11); 

        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
    }
}
