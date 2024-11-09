public class QueueList {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    public QueueList() {
        front = null;
        rear = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        }
    }
    public int dequeue() {
        if (front == null) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        return data;
    }
    public void display() {
        Node current = rear;
        while(current != null) {
            System.out.println(current.data);
           current = current.next;
        }
    }
    public static void main(String... args) {
        QueueList queueList = new QueueList();
        queueList.enqueue(10);
        queueList.enqueue(20);
        queueList.enqueue(30);
        queueList.enqueue(40);
       // queueList.dequeue();
        queueList.display();
    }
}
