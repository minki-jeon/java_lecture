package practice.leetcode.day6.p155;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * packageName    : practice.leetcode.day6.p155
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-26 (일)
 * description    : 155. Min Stack
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-26 (일)        minki-jeon       최초 생성
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 * - MinStack() initializes the stack object.
 * - void push(int val) pushes the element val onto the stack.
 * - void pop() removes the element on the top of the stack.
 * - int top() gets the top element of the stack.
 * - int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input:
         * ["MinStack","push","push","push","getMin","pop","top","getMin"]
         * [[],[-2],[0],[-3],[],[],[],[]]
         * Output: [null,null,null,null,-3,null,0,-2]
         *
         MinStack minStack = new MinStack();
         minStack.push(-2);
         minStack.push(0);
         minStack.push(-3);
         minStack.getMin(); // return -3
         minStack.pop();
         minStack.top();    // return 0
         minStack.getMin(); // return -2
         */

        String[] input1 = {"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
        Integer[] input2 = {null, -2, 0, -3, null, null, null, null};
        Object[] answer = new Object[input1.length];
        MinStack obj = null;
        for (int i = 0; i < input1.length; i++) {
            switch (input1[i]) {
                case "MinStack" -> {
                    obj = new MinStack();
                    answer[i] = null;
                }
                case "push" -> {
                    obj.push(input2[i]);
                    answer[i] = null;
                }
                case "pop" -> {
                    obj.pop();
                    answer[i] = null;
                }
                case "top" -> {
                    int param_3 = obj.top();
                    answer[i] = param_3;
                }
                case "getMin" -> {
                    int param_4 = obj.getMin();
                    answer[i] = param_4;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}

class MinStack {
    static class Element {
        final int value;
        final int min;

        Element(final int value, final int min) {
            this.value = value;
            this.min = min;
        }
    }

    final Stack<Element> stack = new Stack<>();

    public void push(int x) {
        final int min = (stack.empty()) ? x : Math.min(stack.peek().min, x);
        stack.push(new Element(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}

/*
class MinStack_self1 {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.stream().min(Integer::compare).get();
    }
}
*/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */