package Stack.Stack3;

import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9*/+5346";
        System.out.println("Prefix Expression: " + str);
        Stack<String> val = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (val.size() < 2) {
                    System.out.println("Invalid postfix expression!");
                    return;
                }
                String v1 = val.pop();
                String v2 = val.pop();
                String s = v1 + v2 + ch;
                val.push(s);

            }
        }
        System.out.println("Postfix Expression: " + val.peek());
    }
}