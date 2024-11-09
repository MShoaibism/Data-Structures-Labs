public class ArrayQueue {
    int[] Array;
    int front;
    int rear;

    public ArrayQueue() {
        this.front = -1;
        this.rear = -1;
        this.Array = new int[10];
    }
    public void enqueue(int item) {
        if (rear == -1) {
            this.Array[++rear] = item;
        }
    }
    public int dequeue() {
        if (front == -1) {
            return -1;
        }
        int item = this.Array[front];
        front = front + 1;
        return item;
    }
    public void peek() {
        if (front ==-1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println(this.front);
    }
    }
    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.peek();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
    }
}