package practice.leetcode.day3.p1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <pre>
 * packageName    : practice.leetcode.day3.p1
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-22 (수)
 * description    : 1. Two Sum
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-22 (수)        minki-jeon       최초 생성
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         *
         * Input: nums = [3,2,4], target = 6
         * Output: [1,2]
         *
         * Input: nums = [3,3], target = 6
         * Output: [0,1]
         */
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] answer = twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n) && map.get(n) != i) {
                return new int[]{map.get(n), i};
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }


}
