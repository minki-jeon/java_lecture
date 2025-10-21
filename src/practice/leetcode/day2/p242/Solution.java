package practice.leetcode.day2.p242;

import java.util.HashMap;

/**
 * <pre>
 * packageName    : practice.leetcode.day2.p242
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-21 (화)
 * description    : 242. Valid Anagram
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-21 (화)        minki-jeon       최초 생성
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
        boolean answer = isAnagram("ab", "a");
        System.out.println(answer);
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];   // 알파벳 a~z 까지 개수
        // 'a' = 97
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram_self1(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if (map.get(t.charAt(i)) == 0) {
                    map.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }
        if (map.size() > 0) {
            return false;
        }
        return true;
    }
}
