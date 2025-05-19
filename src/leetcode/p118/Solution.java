package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list_pre;
        List<Integer> list = new ArrayList<>();
        list.add(1);    // first-index;
        result.add(list);

        for (int i = 1; i <= numRows - 1; i++) {
            list_pre = list;
            list = new ArrayList<>();
            list.add(1);        // new first-index;
            for (int j = 1; j <= i - 1; j++) {
                // i = 1 -> x
                // i = 2 -> 1 cycle (j = 1)
                // i = 3 -> 2 cycle (j = 1, 2)
                // i = 4 -> 3 cycle (j = 1, 2, 3)
                list.add(list_pre.get(j - 1) + list_pre.get(j));
            }
            list.add(1);    // new last-index;
            result.add(list);
        }

        System.out.println(result);
    }
}
