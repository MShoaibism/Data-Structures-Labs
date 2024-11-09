public class Stack {
    private int top;
    private int[] stack;
    public Stack() {
        top = -1;
        stack = new int[10];
    }
    public void push(int x) {
        stack[++top] = x;
    }
    public int pop() {
        return stack[top--];
    }
    public int peek() {
        int i = stack[top];
        return i;
    }
    public void isEmplty(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
    }
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " | ");
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.pop();
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Value of top is "+s.peek());
       s.display();
    }
}
