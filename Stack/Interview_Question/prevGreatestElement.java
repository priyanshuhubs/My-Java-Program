package Stack.Interview_Question;

import java.util.Stack;

public class prevGreatestElement {
    public static int[] findPrevGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                res[i] = -1;
            } else
                res[i] = st.peek();
            st.push(arr[i]);

        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int res[] = findPrevGreater(arr); // function call

        System.out.println("Next Greater Elements:");
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
