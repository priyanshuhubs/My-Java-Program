package Link_List;

class LLNode {
    int val;
    LLNode next;

    LLNode(int val) {
        this.val = val;
    }

    LLNode(int val, LLNode next) {
        this.val = val;
        this.next = next;
    }
}

class AlgoRunner {
    public LLNode swapKthFromEnd(LLNode head, int k) {
        if (head == null || k <= 0) return head;

        // k-th node from start
        LLNode kthFromStart = head;
        for (int i = 1; i < k && kthFromStart != null; i++) {
            kthFromStart = kthFromStart.next;
        }
        if (kthFromStart == null) return head;

        // k-th node from end
        LLNode fast = head;
        LLNode slow = head;
        for (int i = 1; i <=k; i++) {
            if (fast == null) return head;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Swap values
        int temp = kthFromStart.val;
        kthFromStart.val = slow.val;
        slow.val = temp;

        return head;
    }
}

public class RemoveNodeDemo {
    public static void printList(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
       head.next.next = new LLNode(3);
       head.next.next.next = new LLNode(4);
       head.next.next.next.next = new LLNode(5);


        System.out.print("Original List: ");
        printList(head);

        AlgoRunner algo = new AlgoRunner();
        head = algo.swapKthFromEnd(head, 2);

        System.out.print("After Swapping: ");
        printList(head);
    }
}