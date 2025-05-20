package leetcode.p20;

import java.util.Stack;

public class Solution {
    // 20. Valid Parentheses
    public boolean isValid(String s) {

        // (Way 1)
        Stack<String> stack = new Stack<>();
        for (String c : s.split("")) {
            if ("(".equals(c) || "{".equals(c) || "[".equals(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    String a = stack.pop();
                    if (!("(".equals(a) && ")".equals(c))
                            && !("{".equals(a) && "}".equals(c))
                            && !("[".equals(a) && "]".equals(c))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) return false;

        // (Way 2)
        // Stack<Character> stack = new Stack<>();
        // for (char c : s.toCharArray()) {
        //     switch (c) {
        //         case ']' -> {
        //             if (stack.isEmpty()) {
        //                 return false;
        //             }
        //             char open = stack.pop();
        //             if (open != '[') {
        //                 return false;
        //             }
        //         }
        //         case '}' -> {
        //             if (stack.isEmpty()) {
        //                 return false;
        //             }
        //             char open = stack.pop();
        //             if (open != '{') {
        //                 return false;
        //             }
        //         }
        //         case ')' -> {
        //             if (stack.isEmpty()) {
        //                 return false;
        //             }
        //             char open = stack.pop();
        //             if (open != '(') {
        //                 return false;
        //             }
        //         }
        //         default -> {
        //             stack.push(c);
        //         }
        //     }
        // }

        return stack.isEmpty();
    }
}
