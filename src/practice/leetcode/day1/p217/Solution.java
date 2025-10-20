package practice.leetcode.day1.p217;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <pre>
 * packageName    : practice.leetcode.day1.p217
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-20 (월)
 * description    : 217. Contains Duplicate
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-20 (월)        minki-jeon       최초 생성
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

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicate_solution2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) > 0) {
                return true;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false;
    }

    public static boolean containsDuplicate_solution1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }

        return false;
    }

    public static boolean containsDuplicate_self2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }

    public static boolean containsDuplicate_self1(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (set.size() != nums.length) {
            return true;
        }

        return false;
    }
}
