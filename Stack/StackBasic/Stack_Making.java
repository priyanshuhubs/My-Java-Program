package Stack.StackBasic;

import java.util.Stack;

public class Stack_Making {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
        st.push(10);
        st.push(20);
        while (st.size()>1) {
            st.pop();
        }
        // now size has become 1
        System.out.println(st.peek());
    }
}
