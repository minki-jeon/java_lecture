package practice.leetcode.day3.p217;

import java.util.HashSet;

/**
 * <pre>
 * packageName    : practice.leetcode.day3.p217
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-22 (수)
 * description    : 217. Contains Duplicate
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-22 (수)        minki-jeon       최초 생성
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: nums = [1,2,3,1]
         * Output: true
         *
         * Input: nums = [1,2,3,4]
         * Output: false
         *
         * Input: nums = [1,1,1,3,3,4,3,2,4,2]
         * Output: true
         *
         */

        int[] nums = {1, 2, 3, 1};
        boolean answer = containsDuplicate(nums);
        System.out.println(answer);

    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
