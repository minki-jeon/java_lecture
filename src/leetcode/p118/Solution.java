package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // (Way 1)
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

        // (Way 2)
//        List<Integer> firstRow = new ArrayList<>();
//        firstRow.add(1);
//        result.add(firstRow);
//        for (int j = 1; j < numRows; j++) {
//            List<Integer> prev = result.getLast();   // 이전행
//            List<Integer> row = new ArrayList<>();    // 현재행
//            result.add(row);        // 참조값이 저장되므로 이후에도 result 안의 row에 저장된다.
//
//            row.add(1);
//
//            //중간의 값들
//            for (int i = 0; i < prev.size() - 1; i++) {
//                int n1 = prev.get(i);
//                int n2 = prev.get(i + 1);
//                row.add(n1 + n2);
//            }
//
//            row.add(1);
//        }

        return result;
    }
}
