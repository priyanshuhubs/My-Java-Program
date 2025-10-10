package Stack.Stack3;

import java.util.Stack;

public class InfixEvaluator {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; // Expected output = 4
        System.out.println("Infix : " + str);
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Operand check (digit)
            if (Character.isDigit(ch)) {
                val.push(ch - '0'); // simpler and clearer than ascii-48
            }

            // If operator stack is empty or opening bracket
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }

            // If closing bracket found
            else if (ch == ')') {
                while (op.peek() != '(') {
                    evaluateTop(val, op);
                }
                op.pop(); // remove '('
            }

            // Operator encountered
            else {
                if (ch == '+' || ch == '-') {
                    evaluateTop(val, op); // handle previous ops of any precedence
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        evaluateTop(val, op);
                    }
                    op.push(ch);
                }
            }
        }

        // Final evaluation
        while (!op.isEmpty()) {
            evaluateTop(val, op);
        }

        System.out.println("Result: " + val.peek());
    }

    // 🔹 helper function for repeating code
    private static void evaluateTop(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char operator = op.pop();

        switch (operator) {
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
