package BinaryTree.BinaryTwo;

import java.util.*;

class PairLevelOrderTraversal {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node ,int level){
            this.node = node;
            this.level = level;
        }
    }

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

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.println("Level Order Traversal: ");
        levelOrder(a);
        System.out.println();
    }

    private static void levelOrder(Node root) {
        int prelevel = 0;
        Queue <Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=prelevel){
                System.out.println();
                prelevel++;
            }
            System.out.print(temp.val+" ");
        
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
        
    }
}
