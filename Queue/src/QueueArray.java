public class QueueArray {
    int[]Array;
    int front;
    int rear;
    public QueueArray() {
        this.front = -1;
        this.rear = -1;
        this.Array = new int[10];
    }
    public void enqueue(int item) {
        if(rear == -1) {
            this.Array[++rear] = item;
        }
    }
    public int dequeue() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = Array[front];
        front = front + 1;
        return item;
    }
    public void display() {
        if(front == -1) {
            System.out.println("Queue is empty");
        }
        for(int i = front; i != rear; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
     //   System.out.println(queue.display());
    }
}
