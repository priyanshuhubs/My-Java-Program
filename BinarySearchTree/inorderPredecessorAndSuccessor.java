package BinarySearchTree;

import java.util.ArrayList;

public class inorderPredecessorAndSuccessor {
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        
        int key = 60;
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(a, ans);
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) == key) {
                if (i > 0)
                    System.out.println("Predecessor : " + ans.get(i - 1));
                else
                    System.out.println("No Predecessor");
                if (i < ans.size() - 1)
                    System.out.println("Successor: " + ans.get(i + 1));
                else
                    System.out.println("No Successor");
            }

        }

    }

    public static void inorder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

}
