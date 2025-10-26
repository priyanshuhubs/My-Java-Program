package BinaryTree.BinaryTwo;

import java.util.*;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class levelOrderTraversal {
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        System.out.print("Level Order Traversal: ");
        levelOrder(a);
        System.out.println();
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);

        while (!q.isEmpty()) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
        }
    }

}
