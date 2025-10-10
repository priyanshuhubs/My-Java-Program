package Queue.InterviewQuestion;

import java.util.*;

public class reverseElementsKtimes {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println("Original Queue: " + q);

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2: Pop all from stack back into queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move the remaining (n - k) elements to the back
        
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }

        System.out.println("Queue after reversing first " + k + " elements: " + q);
    }
}
