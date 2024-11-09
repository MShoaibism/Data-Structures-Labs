/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class linkedlist {
    //first we will make class of node 
    int size =0;
    public class Node{
        int data;
        Node next;
        
       
        Node(int data){
            this.data=data;
            this.next=null;
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
  
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
}else{
            Node h=head;
            while(h.next!=null){
                h=h.next;
            }
            h.next = newNode;
        }
        
    }   
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
        }else if(head.next==null){
            head=null;
        }else{
            Node h=head;
            while(h.next.next!=null){
                h=h.next;
            }
            h.next=null;
        }
    }
    public int size(){
        int count=0;
        Node h=head;
        while(h!=null){
            count++;
            h=h.next;
        }
        return count;
    }
    public static void main(String []args){
     linkedlist list=new linkedlist();
     list.insertAtStart(10);
     list.insertAtStart(20);
     list.insertAtStart(30);
     System.out.print("Original Elements: ");
     list.display();
     System.out.print("\nList After adding element at start: ");
     list.insertAtStart(12);
     list.display();
     System.out.print("\nList After deletion At start: ");
     list.deleteAtStart();
     list.display();
      System.out.print("\nList After adding element at the end: ");
     list.insertAtEnd(44);
     list.display();
      System.out.print("\n List After deleting element at the end: ");
      list.deleteAtEnd();
      list.display();
      System.out.print("\n Total size "+list.size());
        
    }  
}
