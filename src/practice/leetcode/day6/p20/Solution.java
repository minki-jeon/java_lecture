package practice.leetcode.day6.p20;

import java.util.Stack;

/**
 * <pre>
 * packageName    : practice.leetcode.day6.p20
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-26 (일)
 * description    : 20. Valid Parentheses
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-26 (일)        minki-jeon       최초 생성
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: s = "()"
         * Output: true
         *
         * Input: s = "()[]{}"
         * Output: true
         *
         * Input: s = "(]"
         * Output: false
         *
         * Input: s = "([])"
         * Output: true
         *
         * Input: s = "([)]"
         * Output: false
         *
         * Input: s = "["
         * Output: false
         */

        String input = "([)]";
        Boolean answer = isValid(input);
        System.out.println(answer);
    }

    private static Boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(', '[', '{' -> stack.push(ch);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static Boolean isValid_self1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if ((pop == '(' && c == ')') || (pop == '[' && c == ']') || (pop == '{' && c == '}')) {
                } else return false;
            }
        }
        return stack.isEmpty();
    }

}
