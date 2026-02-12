package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Valid_Parentheses_list {

    public static List<String> checkString(List<String> list) {

        List<String> lst = new ArrayList<>();

        int i = 0;

        for (String str : list) {
            Stack<Character> stack = new Stack<>();

            boolean flag = true;

            for (i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {

                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }

                    char ch = stack.pop();

                    if (c == ')' && ch != '(') {
                        flag = false;
                        break;
                    } else if (c == ']' && ch != '[') {
                        flag = false;
                        break;
                    } else if (c == '}' && ch != '{') {
                        flag = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                flag = false;
            }

            if (flag)
                lst.add("YES");
            else
                lst.add("NO");
        }
        return lst;
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("()");
        lst.add("()[]{}");
        lst.add("(]");
        lst.add("([])");
        lst.add("([)]");

        System.out.println("Valid paranthesis : " + checkString(lst));
    }
}