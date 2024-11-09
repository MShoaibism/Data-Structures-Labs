public class LLStack {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data= data;
            this.next=null;
        }
    }
    private Node head;
    public void push(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head=newNode;
        }
    }
    public void pop() {
        if(head==null) {
            System.out.println("Stack is empty");
        }

    }
}
