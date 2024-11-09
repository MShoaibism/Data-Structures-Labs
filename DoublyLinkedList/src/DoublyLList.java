public class DoublyLList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;
    public DoublyLList() {
        head = null;
        tail = null;
    }
    public void InserAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = newNode;
        }
    }
    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = newNode;
        }
    }
    public void InsertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = newNode;
        }
    }
    public void DeleteAtStart(int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }
    public void DeleteAtEnd(int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.data == data) {
            head = head.next;
            head.prev = null;
        }
    }
    public void DeleteAtPosition(int position, int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.data == data) {
            head = head.next;
            head.prev = null;
        }
    }
    public void DisplayFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void DisplayFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int Search(int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void reverse(){
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            temp.next = temp.prev;
            temp.prev = temp;
            temp = next;
        }
        head = temp;
    }
public void CountNodes(){

}


    public static void main(String[] args) {
        DoublyLList list = new DoublyLList();
        list.InserAtStart(1);
        list.InserAtStart(2);
        list.InserAtStart(3);
        list.InserAtStart(4);
       // list.reverse();
        list.DisplayFromStart();

    }
}
