package practice.leetcode.day3.p242;

/**
 * <pre>
 * packageName    : practice.leetcode.day3.p242
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-22 (수)
 * description    : 242. Valid Anagram
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-22 (수)        minki-jeon       최초 생성
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: s = "anagram", t = "nagaram"
         * Output: true
         *
         * Input: s = "rat", t = "car"
         * Output: false
         *
         * Input: s = "ab", t = "a"
         * Output: false
         */
        boolean answer = isAnagram("anagram", "nagaram");
        System.out.println(answer);
    }

    private static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) chars[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) chars[t.charAt(i) - 'a']--;
        for (int i : chars) if (i != 0) return false;

        return true;
    }
}
