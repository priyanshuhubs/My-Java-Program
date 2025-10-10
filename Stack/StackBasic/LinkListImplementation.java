package Stack.StackBasic;


public class LinkListImplementation {
    public static class Node { // user definrd data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack { // user defined data strucure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        } 
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int pop(){
            if(head==null){
                System.out.println("Stack Is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
            
        }
        int peek(){
            if(head==null){
                System.out.println("Stack Is Empty!");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
             return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(4);
        st.display();
        System.out.println("Peek: " + st.peek()); // peek check

        st.push(5);
        st.display();
        System.out.println("Peek: " + st.peek()); // peek check

        st.push(1);
        st.display();
        System.out.println("Peek: " + st.peek()); // peek check

        System.out.println("Current size: " + st.size()); // size check

        st.pop(); // pop test
        st.display();
        System.out.println("Peek after pop: " + st.peek());
        System.out.println("Current size: " + st.size());

        st.push(5);
        st.push(8);
      
    }
}
