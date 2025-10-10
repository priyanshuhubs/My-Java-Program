//------------------------Reorder Queue Using Stack---------------------------\\
//--------------------------------------------------------------------------\\

package Queue.InterviewQuestion;

import java.util.*;

class Solution {
    public Queue<Integer> reorderQueueUsingStack(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        int half = q.size() / 2;  // calculate half once

        // Step 1: Move first half to stack
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 2: Push stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Again push first half of queue into stack
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 4: Alternate elements from stack and queue
        for (int i = 0; i < half; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // Step 5: Reverse the queue to get final order
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        return q;
    }
}

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) q.add(i);

        System.out.println("Original Queue : " + q);

        Solution sol = new Solution();
        Queue<Integer> result = sol.reorderQueueUsingStack(q);

        System.out.println("Reordered Queue: " + result);
    }
}
