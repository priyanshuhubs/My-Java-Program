package Doubly_LinkedList;

public class palindromeCheck {
    public static void main(String[] args) {
        dNode a = new dNode(1);
        dNode b = new dNode(2);
        dNode c = new dNode(3);
        dNode d = new dNode(2);
        dNode e = new dNode(1);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        print(a);
            if (isPalindrome(a)) {
            System.out.println("Linked List is a Palindrome");
        }   else {
            System.out.println("Linked List is NOT a Palindrome");
        }
    }

    public static void print(dNode head) {
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static boolean isPalindrome(dNode head){
        if(head == null || head.next==null) return true;
        dNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
        } 
        while(head!=null && tail!=null){
            if(head.val != tail.val) return false;
            else{
                head = head.next;
                tail = tail.prev;
            }
            if (head == tail || head.prev == tail) break;
        }
        return true;
    }
}
