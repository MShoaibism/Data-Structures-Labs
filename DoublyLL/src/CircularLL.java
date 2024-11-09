public class stack {
    public class Node{
        int data;
        stack next;

        public Node(int data){
            this.data = data;
            next = null;

        }
    }
    private Node top;
    private CircularLL (){
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        newNode.next=top;
        top=newNode;
    }
    public void peek(){
        System.out.println(top.data);
    }

    public void pop(){
        int pop_data = top,data;
        top=top.next;
        return pop_data;
    }
    public static void main(String []args){
        Circular obj=new Circular();
        obj.push(20);
        obj.push(30);
        obj.push(35);
        obj.push(46);
        obj.pop();
        obj.peek();

    }
}
