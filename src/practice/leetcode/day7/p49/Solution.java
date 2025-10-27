package practice.leetcode.day7.p49;

import java.util.*;

/**
 * <pre>
 * packageName    : practice.leetcode.day7.p49
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-10-27 (월)
 * description    : 49. Group Anagrams
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-10-27 (월)        minki-jeon       최초 생성
 *
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        /**
         * Input: strs = ["eat","tea","tan","ate","nat","bat"]
         * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         *
         * Input: strs = [""]
         * Output: [[""]]
         *
         * Input: strs = ["a"]
         * Output: [["a"]]
         */

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> answer = groupAnagrams(strs);
        System.out.println(answer);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ca = new char[26];
            for (char c : str.toCharArray()) ca[c - 'a']++;
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams_self2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams_self1(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for (List<String> list : map.values()) {
            answer.add(list);
        }

        return answer;
    }
}
