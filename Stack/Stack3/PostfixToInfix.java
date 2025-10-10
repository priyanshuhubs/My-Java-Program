package Stack.Stack3;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println("Postfix Expression: " + str);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch + "");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                // v1 op v2
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);

            }
        }
        System.out.println("Infix Expression: " + val.peek());

    }
}
