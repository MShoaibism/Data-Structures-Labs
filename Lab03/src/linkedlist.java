import org.w3c.dom.Node;
//Part 01

public class linkedlist {
public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
    private Node head;
    linkedlist(){
        this.head = null;

    }

    public void insertAtStart(int data){
  Node newNode= new Node(data);
 newNode.next=head;
 head=newNode;
  }
  public void insertAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node h=head;
            while(h.next!=null){
                h=h.next;
            }
            h.next = newNode;
        }
  }
  public void insertAtPosition(int data, int position){
Node NewNode =new Node(data);

Node current = head;
      current=current.next;
        if (current.data==position){
          Node temp=current.next;
            current.next=NewNode;
            NewNode.next =temp;

        }
  }

  //Part 02
public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
        }
}
public void deleteAtStart(int position){
        if(head==null){
            System.out.println("List is empty");

        }
        head=head.next;
}
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            int size = 0;
            size++;
            current = current.next;
        }
    }
    public static void main(String[] args) {
linkedlist list=new linkedlist();
list.insertAtStart(5);
list.insertAtStart(6);
list.insertAtStart(7);
list.insertAtStart(8);
list.insertAtEnd(20);
list.insertAtPosition(33,0);
list.deleteAtPosition(4);
list.display();
    }
}
