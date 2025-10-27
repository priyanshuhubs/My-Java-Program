package BinarySearchTree;
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class FindMinMaxBST {
    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(3);
        Node c = new Node(10);
        Node d = new Node(1);
        Node e = new Node(6);
        Node f = new Node(14);
        Node g = new Node(4);
        Node h = new Node(7);
        Node i = new Node(13);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        e.right = h;
        f.left = i;

        System.out.println("Minimum value in BST: " + findMin(a));
        System.out.println("Maximum value in BST: " + findMax(a));
    }

    public static int findMin(Node root) {
        if (root == null)
            throw new IllegalArgumentException("Tree is empty");
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public static int findMax(Node root) {
        if (root == null)
            throw new IllegalArgumentException("Tree is empty");
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}
