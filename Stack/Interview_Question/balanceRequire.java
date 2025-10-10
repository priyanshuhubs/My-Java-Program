package Stack.Interview_Question;

import java.util.Scanner;
import java.util.Stack;

public class balanceRequire {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int extraClosing = 0; // ')' jo stack empty pe aaya

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    extraClosing++; // extra closing bracket
                } else {
                    st.pop(); // matching opening bracket
                }
            }
        }

        if (st.isEmpty() && extraClosing == 0) {
            return true;
        } else {
            System.out.println("Unbalanced! Remove " + (extraClosing + st.size()) + " bracket(s) to fix.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brackets: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
