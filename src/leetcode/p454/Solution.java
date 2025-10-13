package leetcode.p454;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * packageName    : leetcode.p454
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 454. 4Sum Ⅱ
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        int result = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(result);
    }

    private static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        /**
         * TODO 문제 풀이 이해 필요
         *
         */
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // 합한값 map 저장
                int sum = nums1[i] + nums2[j];
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                // 합했을 때 0이 되는 값
                int sum = -(nums3[i] + nums4[j]);
                if (map.containsKey(sum)) {
                    answer += map.get(sum);
                }
            }
        }

        return answer;
    }
}
