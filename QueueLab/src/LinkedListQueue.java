public class LinkedListQueue {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public LinkedListQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
    }
    public int dequeue() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }
    public void peek(){
        if (head == null) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println(head.data);
        }
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.peek();
    }
}