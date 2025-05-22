package leetcode.p2114;

import java.util.Arrays;

public class Solution {
    // 2114. Maximum Number of Words Found in Sentences
    public int mostWordsFound(String[] sentences) {
        // 고전적 for
        // int max = 0;
        // for (String s : sentences) {
        //     int length = s.split(" ").length;
        //     max = Math.max(max, length);
        // }
        // return max;

        // stream
        return Arrays.stream(sentences)
                .map(s -> s.split(" "))
                .mapToInt(s -> s.length)
                .max()
                .getAsInt();
    }
}
