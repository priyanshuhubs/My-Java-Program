package Link_List;

// Singly Linked List implementation
class SLL {
    private Node head; // first node reference
    Node tail; // last node reference
    private int size; // length of list

    // Insert node at the end of list
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) { // if list empty → head & tail are same
            head = tail = temp;
        } else {
            tail.next = temp; // link new node after tail
            tail = temp; // move tail forward
        }
        size++;
        System.out.println("Inserted " + val + " at end");
    }

    // Insert node at the beginning of list
    void insertBeforeHead(int val) {
        Node temp = new Node(val);
        if (head == null) // empty list case
            head = tail = temp;
        else {
            temp.next = head; // link new node to old head
            head = temp; // move head back
        }
        size++;
        System.out.println("Inserted " + val + " before head");
    }

    // Print current size
    void size() {
        System.out.println("Length of Linked list: " + size);
    }

    // Insert node at specific index
    void insert(int idx, int val) {
        if (idx == 0) { // special case → add at head
            insertBeforeHead(val);
            return;
        }
        if (idx == size) { // special case → add at end
            insertAtEnd(val);
            return;
        }
        if (idx > size || idx < 0) { // invalid index
            System.out.println("Invalid Index!!");
            return;
        }

        Node temp = new Node(val);
        Node x = head;

        // move to (idx-1)th node → so we can insert after it
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        // insertion step
        temp.next = x.next;
        x.next = temp;
        size++;
        System.out.println("Inserted " + val + " at index " + idx);
    }

    // Get value at specific index
    int get(int idx) throws Error {
        if (idx == size - 1) { // last element optimization
            return tail.val;
        }
        if (idx >= size || idx < 0) { // out of range
            throw new Error("Bhai error hoga index size se chota daal diya hai");
        }

        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        System.out.println("Accessed element at index " + idx + ": " + temp.val);
        return temp.val;
    }

    void set(int idx, int Newval) {
        if (idx == size - 1)
            tail.val = Newval;
        if (idx >= size || idx < 0) {
            throw new Error("Bhai error");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.val = Newval;
    }

    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is Empty");
        head = head.next;
        size--;
    }

    void delete(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx >= size || idx < 0)
            throw new Error("Invalid Index!!");
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail)
            tail = temp;
        temp.next = temp.next.next;
        size--;
    }

    // Print linked list
    void display() {
        Node temp = head;
        System.out.print("Current List: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.size();
        list.insertAtEnd(23);
        list.insertAtEnd(28);
        list.insertBeforeHead(55);
        list.display();
        list.size();

        list.insertAtEnd(45);
        list.insertAtEnd(12);
        list.insertBeforeHead(35);
        list.insertBeforeHead(78);
        list.display();
        list.size();

        list.insert(4, 80); // inserting at index 4
        list.display();

        list.insert(10, 25); // invalid index
        list.display();

        System.out.println("Value at index 3: " + list.get(3));
        System.out.println("Value at index 5: " + list.get(5));

        list.set(2, 90);
        list.display();
        list.deleteAtHead();
        list.display();
        list.size();
        list.delete(2);
        list.display();
        list.size();
        list.delete(5);
        list.display();
        list.size();
        System.out.println(list.tail.val);
    }
}
