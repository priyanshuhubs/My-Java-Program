package Link_List;

public class RecursivelyDisplayingLinkList {
    public static void display(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        display(head.next);
    }

    public static void findTail(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("\nTail Node: " + head.val);
            return;
        }
        findTail(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(29);
        Node c = new Node(66);
        Node d = new Node(98);
        Node e = new Node(52);
        a.next = b; // 10 -> 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 50
        System.out.println("Link List: ");
        display(a);

        findTail(a);

    }
}
