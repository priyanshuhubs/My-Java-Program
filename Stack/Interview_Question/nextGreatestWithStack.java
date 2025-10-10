package Stack.Interview_Question;

import java.util.Stack;

public class nextGreatestWithStack {
    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else
                res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        System.out.println("Array: ");
        for (int ele : arr) {
            System.out.print( ele + " ");
        }
        System.out.println();

        int res[] = findNextGreater(arr); // function call

        System.out.println("Next Greater Elements:");
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
