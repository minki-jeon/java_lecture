package leetcode.p442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                result.add(n);
            }
        }

        return result;
    }
}
