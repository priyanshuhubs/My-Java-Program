package Queue.Queue_Basics;

import java.util.*;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear 5 4 3 2 1 -> front
        Queue<Integer> helper = new ArrayDeque<>();
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            helper.add(q.poll());

        }
        while (!helper.isEmpty()) {
            q.add(helper.poll());
        }
    }
}
