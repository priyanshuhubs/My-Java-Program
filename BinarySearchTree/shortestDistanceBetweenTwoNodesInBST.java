package BinarySearchTree;
// Java program to find distance between
// two nodes in BST
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
class shortestDistanceBetweenTwoNodesInBST {

    // Function to find distance of x from root.
    static int distanceFromRoot(Node root, int x) {

        // if node's value is equal to x return 0.
        if (root.data == x)
            return 0;

        // if node's value is greater than x
        // return the distance from left child + 1
        else if (root.data > x)
            return 1 + distanceFromRoot(root.left, x);

        // if node's value is smaller than x
        // return the distance from right child + 1
        return 1 + distanceFromRoot(root.right, x);
    }

    // Function to find minimum distance between a and
    // b.
    static int distanceBetweenTwoKeys(Node root, int a,
                                      int b) {

        // Base Case: return 0 for null.
        if (root == null)
            return 0;

        // Both keys lie in left subtree
        if (root.data > a && root.data > b)
            return distanceBetweenTwoKeys(root.left, a, b);

        // Both keys lie in right subtree
        if (root.data < a && root.data < b)
            return distanceBetweenTwoKeys(root.right, a, b);

        // if keys lie in different subtree
        // taking current node as LCA, return the
        // sum of distance of keys from current node.
        return distanceFromRoot(root, a)
            + distanceFromRoot(root, b);
    }

    public static void main(String[] args) {

        // creating the binary search tree
        //          5
        //        /   \
        //       2     12
        //      / \    /  \
        //     1   3  9    21
        //                /  \
        //              19    25

        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(12);
        root.right.left = new Node(9);
        root.right.right = new Node(21);
        root.right.right.left = new Node(19);
        root.right.right.right = new Node(25);

        int a = 9, b = 25;
        System.out.println("Total Distance: "+
            distanceBetweenTwoKeys(root, a, b));
    }
}