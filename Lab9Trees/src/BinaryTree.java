import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class BinaryTree {
    public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node root;

    public BinaryTree() {
        root = null;
    }

    // INSERTION USING BINARY SEARCH TREE PROPERTY
    public void insertion(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // COUNT NODES ITERATIVELY
    public int count() {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            count++;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return count;
    }

    // LEVEL-ORDER TRAVERSAL ITERATIVELY
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    // IN-ORDER TRAVERSAL ITERATIVELY
    public void inOrderTraversal() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }

    // PRE-ORDER TRAVERSAL ITERATIVELY
    public void preOrderTraversal() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        System.out.println();
    }

    // POST-ORDER TRAVERSAL ITERATIVELY
    public void postOrderTraversal() {
        if (root == null) {
            return;
        }

        Stack <Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert elements
        int[] elements = {5, 3, 2, 4, 7, 6, 8};
        for (int element : elements) {
            tree.insertion(element);
        }

        System.out.println("The total number of nodes: " + tree.count());

        // Traversals
        System.out.print("Level-order Traversal: ");
        tree.levelOrderTraversal();

        System.out.print("Pre-order Traversal: ");
        tree.preOrderTraversal();

        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal();

        System.out.print("Post-order Traversal: ");
        tree.postOrderTraversal();
    }
}
