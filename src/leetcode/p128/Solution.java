package leetcode.p128;

import java.util.*;

/**
 * <pre>
 * packageName    : leetcode.p128
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 128. Longest Consecutive Sequence
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    private static int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            int num = nums[i];
            // num의 내림차순
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }
            // num 초기화
            num = nums[i];

            // num의 오름차순
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }
            answer = Math.max(answer, count);
        }

        return answer;
    }
}
