package practice.leetcode.day1.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * packageName    : practice.leetcode.day1.p1
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-20 (월)
 * description    : 1. Two Sum
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-20 (월)        minki-jeon       최초 생성
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
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t) && map.get(t) != i) {
                answer[0] = i;
                answer[1] = map.get(t);
                return answer;
            }
            map.put(nums[i], i);
        }

        return answer;
    }

    public static int[] twoSum_solution1(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t) && map.get(t) != i) {
                answer[0] = i;
                answer[1] = map.get(t);
                return answer;
            }
        }

        return answer;
    }

    public static int[] twoSum_self1(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}
