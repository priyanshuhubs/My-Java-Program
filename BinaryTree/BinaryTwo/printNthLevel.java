package BinaryTree.BinaryTwo;

import java.util.Scanner;

class printNthLevel {
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

       
        System.out.println("Level Order: ");
        for (int x = 0; x <= levels(a) - 1; x++) {
            nthLevel(a, 0, x);
            System.out.println(); // move to next line after each level
        }

        // Ask user for a particular level to print
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get particular level: ");
        int n = sc.nextInt();
        nthLevel(a, 0, n); // Print nodes at user-specified level
        System.out.println();

        sc.close();
    }

    private static void nthLevel(Node root, int level, int lvl) {
        if (root == null)
            return; // Base case: empty node
        if (level == lvl) // If current node is at target level
            System.out.print(root.val + " "); // Print the node value
        // Recur for left and right subtree, incrementing current level
        nthLevel(root.left, level + 1, lvl);
        nthLevel(root.right, level + 1, lvl);
    }

    private static int levels(Node root) {
        if (root == null)
            return 0; // Base case: empty node has 0 height
        // Height = 1 + max(height of left subtree, height of right subtree)
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}
