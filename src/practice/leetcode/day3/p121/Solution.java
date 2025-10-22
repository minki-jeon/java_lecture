package practice.leetcode.day3.p121;

/**
 * <pre>
 * packageName    : practice.leetcode.day3.p121
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-22 (수)
 * description    : 121. Best Time to Buy and Sell Stock
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-22 (수)        minki-jeon       최초 생성
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         *
         * Input: prices = [7,6,4,3,1]
         * Output: 0
         *
         */
        int[] prices = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);
        System.out.println(answer);
    }

    private static int maxProfit(int[] prices) {
        int answer = 0;     // profit

        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > answer) {
                answer = prices[i] - buy;
            }
        }

        return answer;
    }
}
