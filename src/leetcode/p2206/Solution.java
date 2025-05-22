package leetcode.p2206;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Solution {
    // 2206. Divide Array Into Equal Pairs
    public boolean divideArray(int[] nums) {
        // stream

//        Map<Integer, Long> map = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//        return map.values().stream().allMatch(e -> e % 2 == 0);

//        Map<Integer, Long> map = Arrays.stream(nums)
//                .boxed()
////                .collect(Collectors.groupingBy(Function.identity(), counting()));
//                .collect(groupingBy(identity(), counting()));
//        return map.values().stream().allMatch(e -> e % 2 == 0);
        
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values().stream().allMatch(e -> e % 2 == 0);

/*
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
*/
    }
}
