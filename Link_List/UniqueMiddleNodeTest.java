package Link_List;

// Node class for linked list
class MyListNode {
    int val;
    MyListNode next;

    MyListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Class to find middle node
class MyMiddleFinder {
    public MyListNode findMiddle(MyListNode head) {
        MyListNode slow = head;
        MyListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

// Main class to run the program
public class UniqueMiddleNodeTest {
    public static void display(MyListNode head) {
        MyListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyListNode head = new MyListNode(10);
        head.next = new MyListNode(20);
        head.next.next = new MyListNode(30);
        head.next.next.next = new MyListNode(40);
        head.next.next.next.next = new MyListNode(50);
      //  head.next.next.next.next.next = new MyListNode(500);

        display(head);
        // Create object of MyMiddleFinder
        MyMiddleFinder finder = new MyMiddleFinder();
        MyListNode middle = finder.findMiddle(head);

        System.out.println("Middle node value: " + middle.val);
    }
}
