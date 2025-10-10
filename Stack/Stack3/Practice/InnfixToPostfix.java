package Stack.Stack3.Practice;

import java.util.Stack;

public class InnfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix Expression: " + infix);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                val.push("" + ch);
            } else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    evaluate(val, op);
                }
                op.pop(); // '(' remove

            } else {
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' ||
                            op.peek() == '*' || op.peek() == '/')) {
                        evaluate(val, op);
                    }
                    op.push(ch);

                } else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        evaluate(val, op);
                    }
                    op.push(ch);
                }
            }
        }

        while (!op.isEmpty()) {
            evaluate(val, op);
        }

        String postfix = val.pop();
        System.out.println("Postfix Expression: " + postfix);
    }

    // Helper function
    public static void evaluate(Stack<String> val, Stack<Character> op) {
        String v2 = val.pop();
        String v1 = val.pop();
        char o = op.pop();
        String t = v1 + v2 + o; // postfix form: v1 v2 op
        val.push(t);
    }
}
