package practice.leetcode.day4.p238;

import java.util.Arrays;

/**
 * <pre>
 * packageName    : practice.leetcode.day4.p238
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-23 (목)
 * description    : 238. Product of Array Except Self
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-23 (목)        minki-jeon       최초 생성
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: nums = [1,2,3,4]
         * Output: [24,12,8,6]
         *
         * Input: nums = [-1,1,0,-3,3]
         * Output: [0,0,9,0,0]
         */

        int[] answer = productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        System.out.println(Arrays.toString(answer));
    }

    private static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        Arrays.fill(answer, 1);
        int product = 1;
        for (int i = 0; i < len; i++) {
            answer[i] *= product;
            product *= nums[i];
        }
        product = 1;
        for (int i = len - 1; i >= 0; i--) {
            answer[i] *= product;
            product *= nums[i];
        }
        return answer;
    }

    private static int[] productExceptSelf_self1(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        int zeroIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroIdx == -1) {
                zeroIdx = i;
                continue;
            } else if (nums[i] == 0 && zeroIdx != -1) {
                zeroIdx = -2;
                break;
            }
            product *= nums[i];
        }

        if (zeroIdx == -2) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = 0;
            }
        } else if (zeroIdx == -1) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (zeroIdx == i) answer[i] = product;
                else answer[i] = 0;
            }
        }

        return answer;
    }
}
