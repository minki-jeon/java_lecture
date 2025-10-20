package practice.leetcode.day1.p121;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * packageName    : practice.leetcode.day1.p121
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-20 (월)
 * description    : 121. Best Time to Buy and Sell Stock
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-20 (월)        minki-jeon       최초 생성
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

    public static int maxProfit(int[] prices) {
        int answer = 0;

        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > answer) {
                answer = prices[i] - min;
            }
        }

        return answer;
    }

    public static int maxProfit_self2(int[] prices) {
        int answer = 0;

        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            if (prices[i - 1] < prices[i]) {
                max = Math.max(max, prices[i]);
            } else {
                max = prices[i];
            }
            answer = Math.max(answer, max - min);
        }

        return answer;
    }

    public static int maxProfit_self1(int[] prices) {
        int answer = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int n = prices[j] - prices[i];
                if (n > answer) {
                    answer = n;
                }
            }
        }

        return answer;
    }
}
