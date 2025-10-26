package BinaryTree.Implemenetation;

public class SumAndProductOfTreeNodes {
    public static void main(String[] args) {
        Node a = new Node(1);  // root node
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;
        e.right = h;

        display(a);
        System.out.println();
        System.out.println("Sum of all nodes: " + sum(a));
        System.out.println("Product of non-zero nodes: " + product(a));
        System.out.println("Maximum Nodes: " + max(a));
        System.out.println("Size of Binary Tree: " + size(a));
        System.out.println("Levels of Binary Tree: " + levels(a));


    }

    private static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int sum(Node root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(Node root){
        if(root == null) return 1;
        if(root.val != 0)
            return root.val * product(root.left) * product(root.right);
        else
            return product(root.left) * product(root.right); // skip 0
    }

    private static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val ,  b = max(root.left), c = max(root.right);
        return Math.max(a,Math.max(b, c));
    }

    private static int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int levels(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left) , levels(root.right));
    }
} 
