public class LinkedList {
    //first we will make class of node
    int size =0;
    public class Node{
        int data;
        Node next;

        //Node constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }//end of node class
    private Node head;
    void LinkedList(){
        this.head = null;
    }

    public void insertAtStart(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+",");
            size++;
            current=current.next;
        }


    }
    public void deleteAtStart(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
    }
     public void sizeOfList(){
         if(head==null){
          return;
      }
    public void insertAtEnd;(int data){

    }
    public void deleteAtEnd(int data){

    }
    public static void main(String []args){
        LinkedList list=new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        //list.insertAtStart(50);
        list.display();
        System.out.println("");
        System.out.println("List after deletion");
        list.deleteAtStart();
        list.display();
        System.out.println("\n"+list.size);
    }
}
