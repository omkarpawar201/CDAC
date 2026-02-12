package Leetcode;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public static String checkString(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return "NO";
                }

                char ch = stack.pop();

                if (c == ')' && ch != '(') {
                    return "NO";
                } else if (c == ']' && ch != '[') {
                    return "NO";
                } else if (c == '}' && ch != '{') {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        String str = "([)]";

        System.out.println("Valid paranthesis : " + checkString(str));
    }
}
