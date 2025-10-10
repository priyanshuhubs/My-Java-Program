package Stack.StackBasic;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(50);
        st_original.push(80);
        System.out.println(st_original);

        Stack<Integer> st_reversed = new Stack<>();
        while (!st_original.isEmpty()) {
            st_reversed.push(st_original.pop());
        }
        System.out.println(st_reversed);

        // TC = O(n) -> we pop elments from original stack and push in reverse stack
        // TC = O(n) -> for auxialary space

    }
}
