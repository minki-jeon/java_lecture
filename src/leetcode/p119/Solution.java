package leetcode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        // ref. chatGPT
        // (Way 1)
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            // 뒤에서부터 값을 업데이트(set)한다.
            for (int j = i - 1; j >= 1; j--) {
                System.out.println(result);
                result.set(j, result.get(j) + result.get(j - 1));
            }
            result.add(1);
        }

        // (Way 2)
//        List<Integer> prev;
//        List<Integer> result = new ArrayList<>();
//        result.add(1);  // first-index
//        for (int currentIndex = 0; currentIndex < rowIndex; currentIndex++) {
//            prev = result;
//            result = new ArrayList<>();
//            result.add(1); // new first-index
//            for (int i = 0; i <= prev.size() - 2; i++) {
//                result.add(prev.get(i) + prev.get(i + 1));
//            }
//            result.add(1);  // new last-index
//        }

        return result;
    }
}
