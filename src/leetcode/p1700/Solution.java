package leetcode.p1700;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    // 1700. Number of Students Unable to Eat Lunch
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> st = new LinkedList<>();
        Stack<Integer> sa = new Stack<>();

        for (int n : students) {
            st.offer(n);
        }

        for (int i = sandwiches.length - 1; i > -1; i--) {
            // 배열 마지막부터 stack 저장
            sa.push(sandwiches[i]);
        }

        boolean loop = true;
        while (loop) {
            Integer a = st.poll();
            Integer b = sa.peek();
            if (a == b) {
                sa.pop();
            } else {
                st.offer(a);
            }
            if (st.isEmpty() || (!st.isEmpty() && !st.contains(sa.peek()))) {
                loop = false;
            }
        }

        return st.size();
    }
}
