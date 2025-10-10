package Stack.Stack3;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println("Prefix Expression: " + str);
        Stack<Integer> val = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                switch (ch) {
                    case '+':
                        val.push(v1 + v2);
                        break;
                    case '-':
                        val.push(v1 - v2);
                        break;
                    case '*':
                        val.push(v1 * v2);
                        break;
                    case '/':
                        val.push(v1 / v2);
                        break;
                }
            }
        }
        System.out.println("Result: " + val.peek());
    }
}
