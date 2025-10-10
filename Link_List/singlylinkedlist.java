package Link_List;

// class Node {
//     int val;
//     Node next;
//      Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

class SL {
    Node head;
    Node tail;
    int size;

    void insertAtFirst(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtLastt(int val) {
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insert(int idx, int val) throws Error {
        if (idx == 0) {
            insertAtFirst(val);
            return;
        }
        if (idx == size) {
            insertAtLastt(val);
            return;
        }
        if (idx >size || idx < 0) {
            System.out.println("INVALID BRO");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    void deleteFirst() throws Error {
        if (head == null) {
            throw new Error("Invalid  Bro!!");
        }
        head = head.next;
        size--;
    }

    void delete(int idx) throws Error {
        if (idx == 0) {
            deleteFirst();
            return;
        }
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index Bro!!");
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;

    }

    int get(int idx) throws Error {
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index Bro!!");
        }
        if (idx == size - 1){
            return tail.val;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int newVal) throws Error {
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index Bro!!");
        }
        if (idx == size - 1)
           tail.val = newVal;
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
         temp.val = newVal;
    }

    void size() {
        System.out.println(size);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class singlylinkedlist {
    public static void main(String[] args) {
        SL list = new SL();
        list.insertAtFirst(33);
        list.insert(1, 45);
        list.insertAtLastt(66);
        list.insert(2, 55);
        list.insertAtLastt(67);
        System.out.println(list.get(3));
        list.display();
        list.size();
        list.set(1, 99);
        list.display();
        list.size();
        System.out.println(list.tail.val);

    }
}
