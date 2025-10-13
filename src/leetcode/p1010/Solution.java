package leetcode.p1010;

/**
 * <pre>
 * packageName    : leetcode.p1010
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 1010. Pairs of Songs With Total Durations Divisible by 60
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int[] time = new int[]{30, 20, 150, 100, 40};
        int result = numPairsDivisibleBy60(time);
        System.out.println(result);
    }

    private static int numPairsDivisibleBy60(int[] time) {
        int answer = 0;

        /**
         * Time Limit Exceeded
         */
//        for (int i = 0; i < time.length; i++) {
//            for (int j = i + 1; j < time.length; j++) {
//                if ((time[i] + time[j]) % 60 == 0) answer++;
//            }
//        }

        
        return answer;
    }
}
