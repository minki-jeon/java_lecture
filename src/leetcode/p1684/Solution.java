package leetcode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // 1684. Count the Number of Consistent Strings
    public int countConsistentStrings(String allowed, String[] words) {
        
        // 1. allowed에 있는 각 문자(Character)를 저장한 Set 생성
        // - Set 생성, allowed의 각 문자 탐색하여 set에 저장
        // 2. Words에 있는 각 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 존재하는지 확인
        // - words 전체 탐색, word의 각 문자(Char)가 Set에 존재하는지 확인(contains), 모두 존재하면 count 증가
        // 3. count 반환

        // (Way 1 - Set)
        Set<Character> allowedSet = new HashSet<>();
        for (char w : allowed.toCharArray()) {
            allowedSet.add(w);
        }
        int count = 0;
        for (String word : words) {
            char[] w = word.toCharArray();
            boolean isChars = true;
            for (char c : w) {
                boolean isChar = allowedSet.contains(c);
                if (!isChar) isChars = false;
            }
            if (isChars) {
                count++;
            }
        }

        return count;
    }
}
