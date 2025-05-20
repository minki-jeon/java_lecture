package leetcode.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        // 2206. Divide Array Into Equal Pairs

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // (Way 1)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) return false;
        }

        // (Way 2)
        // for (Integer value : map.values()) {
        //     if (value % 2 == 1) {
        //         return false;
        //     }
        // }

        return true;
    }
}
