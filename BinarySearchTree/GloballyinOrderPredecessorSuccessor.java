package BinarySearchTree;

public class GloballyinOrderPredecessorSuccessor {
    
    private static Node pre = null;
    private static Node succ = null;
    private static Node prev = null;

    public static void findpredeAndSucc(Node root, int key) {
        if (root == null)
            return;
        findpredeAndSucc(root.left, key);
        if (root.val == key) {
            pre = prev;
        }
        if (prev != null && prev.val == key) {
            succ = prev;
        }
        prev = root;
        findpredeAndSucc(root.right, key);
    }

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
        findpredeAndSucc(a, key);
        if (pre != null) {
            System.out.println("Predecessor: " + pre.val);
        } else {
            System.out.println("No Predecure");
        }
        if (succ != null) {
            System.out.println("Successor: " + succ.val);
        } else {
            System.out.println("No Successor");
        }
    }

}
