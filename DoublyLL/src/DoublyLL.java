public class DoublyLL {
    public class node{
        int data;
        node next;
        node prev;
         node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    node head;
    node tail;
    public DoublyLL(){
        head = null;
        tail = null;
    }
    public void insertAtStart(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
    }
    public void insertAtEnd(int data){
        node newNode = new node(data);
        if(head == null){
            head.next = newNode;
        }
    }

    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.insertAtStart(1);
        doublyLL.insertAtEnd(2);
        doublyLL.insertAtEnd(3);
        doublyLL.insertAtEnd(4);
        doublyLL.insertAtEnd(5);
        doublyLL.insertAtEnd(6);
    }

}
