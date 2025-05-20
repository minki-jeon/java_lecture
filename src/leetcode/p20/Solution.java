package leetcode.p20;

import java.util.Stack;

public class Solution {
    // 20. Valid Parentheses
    public boolean isValid(String s) {
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

        return true;
    }
}
