package practice.leetcode.day4.p53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * packageName    : practice.leetcode.day4.p53
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-23 (목)
 * description    : 53. Maximum Subarray
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-23 (목)        minki-jeon       최초 생성
 *
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         *
         * Input: nums = [1]
         * Output: 1
         *
         * Input: nums = [5,4,-1,7,8]
         * Output: 23
         */
        int answer = maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(answer);
    }

    private static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) sum = 0;
        }

        return maxSum;
    }

    private static int maxSubArray_self2(int[] nums) {
        /**
         * Solution Explanation:
         * (1) 배열의 인덱스 0번의 값과 1번의 값을 더한 값은 max값으로 저장하고, 더한 값이 0보다 크면 sum에 저장하고 아니면 0을 sum에 저장한다.
         * (2) 다음 2번 값과 sum을 더하여 max값보다 크면 max에 저장하고, 더한 값이 0보다 크면 sum에 저장하고 아니면 0을 sum에 저장한다.
         */
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    private static int maxSubArray_self1(int[] ints) {
        int maxSum = 0;
        /**
         * thinking:
         * (1) 배열 내의 가장 큰 숫자가 0 이하라면 해당 숫자를 반환
         * (2) 배열 내의 가장 큰 숫자가 0보다 크다면(양수), 해당 숫자를 기준으로 다른 양수인 숫자들 사이의 합계를 각각 구해서 가장 큰 합계를 반환
         */

        return maxSum;
    }
}
