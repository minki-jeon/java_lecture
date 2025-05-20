package leetcode.p1748;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {
        // 1748. Sum of Unique Elements

        // nums 전체 탐색해서 각 아이템이 몇 번 나오는지 카운트하기
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                // n이 존재하면
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                map.put(n, 1);
            }
        }

        // map 전체 탐색해서 value가 1인 key들을 합연산
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }
}
