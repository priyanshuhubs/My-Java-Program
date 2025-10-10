package Stack.Stack3;

import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println("Postfix Expression: " + str);
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (val.size() < 2) {
                    System.out.println("Invalid postfix expression!");
                    return;
                }
                String v2 = val.pop();
                String v1 = val.pop();
                String t = ch + v1 + v2;
                val.push(t);
            }
        }
        System.out.println("Prefix Expression: " + val.peek());
    }

}
