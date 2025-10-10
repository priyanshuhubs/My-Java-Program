package Stack.StackBasic;

import java.util.Stack;



public class pushElmentAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println("Orginal Stack: " + st_original);
        int newElement = 50;
        int pos = 2;

        Stack<Integer> temp = new Stack<>();
        while (st_original.size()>=pos) {
            temp.push(st_original.pop());
        }

        st_original.push(newElement);
        while (temp.size()>0) {
            st_original.push(temp.pop());
        }
        System.out.println("After inserting new element at that position" + st_original);
    }
}
