public class StackLL {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    public StackLL() {
        top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        }
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return 0;
        }
         int data = top.data;
    return data;
}
public void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "|");
            temp = temp.next;
        }
}
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
    }
}
