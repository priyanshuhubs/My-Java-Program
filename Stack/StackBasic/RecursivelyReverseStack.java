package Stack.StackBasic;

import java.util.Stack;

public class RecursivelyReverseStack {
    public static void displayReverse(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println("Orginal Stack: " + st_original);
        
        System.out.print("Reversed Stack: ");
        displayReverse(st_original);
    }
}
