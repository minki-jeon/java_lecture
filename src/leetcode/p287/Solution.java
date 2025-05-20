package leetcode.p287;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        // (* Use Set Class)
        // nums의 모든 요소를 탐색해서 set에 저장하고
        // 저장할 때 반환되는 결과값이 false였을 때 해당 요소를 반환

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return 0;
    }

}
