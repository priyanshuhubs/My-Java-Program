package Doubly_LinkedList;

// Doubly Linked List Implementation
public class doublyImple2 {

    // Node class (already defined in your other file, keeping same)

    // static class dNode {
    //     int val;
    //     dNode next;
    //     dNode prev;

    //     dNode(int val) {
    //         this.val = val;
    //     }
    // }

    static class DLL {
        dNode head;
        dNode tail;
        int size;

        // Display the DLL from head to tail
        void display() {
            dNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Return current size
        int size() {
            return size;
        }

        // Insert at end
        void insertAtTail(int val) {
            dNode temp = new dNode(val);
            if (size == 0)
                head = tail = temp;
            else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        // Insert at start
        void insertAtHead(int val) {
            dNode temp = new dNode(val);
            if (size == 0)
                head = tail = temp;
            else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        // Insert at given index
        void insert(int idx, int val) {
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            if (idx == size) {
                insertAtTail(val);
                return;
            }
            if (idx > size || idx < 0) { // invalid index
                System.out.println("Invalid Index!!");
                return;
            }
            dNode temp = new dNode(val);
            dNode x = head;
            for (int i = 1; i <= idx - 1; i++) {
                x = x.next;
            }
            dNode y = x.next;
            x.next = temp;
            temp.prev = x;
            y.prev = temp;
            temp.next = y;
            size++;
        }

        // Delete first node
        void deleteAtHead() throws Error {
            if (head == null)
                throw new Error("List is Empty");
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null; // if list became empty
            size--;
        }

        // Delete last node
        void deleteAtTail() throws Error {
            if (size == 0)
                throw new Error("List Empty bro");
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
            else
                head = null; // if list became empty
            size--;
        }

        // Delete node by index
        void deleteIndex(int idx) throws Error {
            if (idx == 0) {
                deleteAtHead();
                return;
            }
            if (idx == size - 1) {
                deleteAtTail();
                return;
            }
            if (idx >= size || idx < 0) {
                throw new Error("Invalid Index!!");
            }
            dNode temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }

        // Get value at index
        int get(int idx) throws Error {
            if (idx == size - 1) { // last element optimization
                return tail.val;
            }
            if (idx >= size || idx < 0) {
                throw new Error("Bhai error hoga index size se chota daal diya hai");
            }
            dNode temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

        // Set/Update value at index
        void set(int idx, int Newval) throws Error {
            if (idx == size - 1) { // last element optimization
                tail.val = Newval;
                return;
            }
            if (idx >= size || idx < 0) {
                throw new Error("Bhai error hoga index size se chota daal diya hai");
            }
            dNode temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.val = Newval;
        }
    }

    // Main method to test everything
    public static void main(String[] args) {
        DLL list = new DLL();

        // Insertions
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display(); // 10 20 30
        System.out.println("Size: " + list.size());

        list.insertAtHead(5);
        list.display(); // 5 10 20 30
        System.out.println("Size: " + list.size());

        list.insert(2, 15);
        list.display(); // 5 10 15 20 30
        System.out.println("Size: " + list.size());

        // Deletions
        list.deleteAtHead();
        list.display(); // 10 15 20 30
        System.out.println("Size: " + list.size());

        list.deleteAtTail();
        list.display(); // 10 15 20
        System.out.println("Size: " + list.size());

        list.deleteIndex(1);
        list.display(); // 10 20
        System.out.println("Size: " + list.size());

        // Get & Set
        System.out.println("Value at index 1: " + list.get(1)); // 20
        list.set(3, 99);
        list.display(); // 10 99
        System.out.println("Size: " + list.size());
    }
}
