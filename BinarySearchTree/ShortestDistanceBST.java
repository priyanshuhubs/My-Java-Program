package BinarySearchTree;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class ShortestDistanceBST {

    // Function to find LCA (Lowest Common Ancestor)
    static TreeNode findLCA(TreeNode root, int n1, int n2) {
        if (root == null) return null;

        if (root.val > n1 && root.val > n2)
            return findLCA(root.left, n1, n2);

        if (root.val < n1 && root.val < n2)
            return findLCA(root.right, n1, n2);

        return root;
    }

    // Function to find distance from a given node to a key
    static int findDistance(TreeNode root, int key) {
        if (root.val == key) return 0;
        else if (root.val > key) return 1 + findDistance(root.left, key);
        else return 1 + findDistance(root.right, key);
    }

    // Function to find distance between two keys
    static int distanceBetweenTwoKeys(TreeNode root, int a, int b) {
        TreeNode lca = findLCA(root, a, b);
        return findDistance(lca, a) + findDistance(lca, b);
    }

    // Main method
    public static void main(String[] args) {
        // Tree example
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int a = 2, b = 6;
        System.out.println("Distance between " + a + " and " + b + " is: " +
                distanceBetweenTwoKeys(root, a, b));
    }
}
