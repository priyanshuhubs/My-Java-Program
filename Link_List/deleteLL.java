package Link_List;

// Node class for Linked List
class ListNodee {
    int val;
    ListNodee next;

    ListNodee(int val) {
        this.val = val;
    }
}

// Solution class containing deleteNodee method
class Solution {
    public void deleteNodee(ListNodee node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Cannot delete this node (either null or last node).");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class deleteLL {
    public static void display(ListNodee head) {
        ListNodee temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNodee a = new ListNodee(33);
        ListNodee b = new ListNodee(44);
        ListNodee c = new ListNodee(11);
        ListNodee d = new ListNodee(36);
        ListNodee e = new ListNodee(98);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        display(a);

        Solution sol = new Solution();

        //  First delete 11
        sol.deleteNodee(c);
        System.out.println("After deleting 11:");
        display(a);

        //  Now delete 44
        sol.deleteNodee(b);
        System.out.println("After deleting 44:");
        display(a);
    }
}
