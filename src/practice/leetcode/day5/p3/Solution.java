package practice.leetcode.day5.p3;

import java.util.LinkedList;

/**
 * <pre>
 * packageName    : practice.leetcode.day5.p3
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-24 (금)
 * description    : 3. Longest Substring Without Repeating Characters
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-24 (금)        minki-jeon       최초 생성
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: s = "abcabcbb"
         * Output: 3
         *
         * Input: s = "bbbbb"
         * Output: 1
         *
         * Input: s = "pwwkew"
         * Output: 3
         */

        String s = "pwwkew";
        int answer = lengthOfLongestSubstring_self1(s);
        System.out.println(answer);
    }

    private static int lengthOfLongestSubstring_self1(String s) {
        int max = 0;
        LinkedList<Character> chars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars.contains(c)) {
                for (int idx = chars.indexOf(c); idx > -1; idx--) {
                    chars.remove(idx);
                }
            }
            chars.add(c);
            max = Math.max(max, chars.size());
        }

        return max;
    }
}
