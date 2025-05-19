package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // (Way 1)
        // 1. kids List에서 가장 큰 값 구하기
        int max = 0;
        for (int n : kids) {
            if (n > max) max = n;
        }

        // 2. List<Boolean> result 객체 만들기
        List<Boolean> result = new ArrayList<>();

        // 3. kids의 각 요소에 extraCandy를 더하여 (1)에서 구한 가장 큰 값보다 크거나 같으면
        //    result에 true 추가, 아니면 false 추가
        for (int i = 0; i < kids.size(); i++) {
            if (kids.get(i) + extraCandies >= max) result.add(true);
            else result.add(false);
        }

        // (Way 2)
//        int max = 0;
//        for (Integer c : kids) {
//            max = Math.max(max, c);
//        }
//
//        List<Booolean> result = new ArrayList<>();
//
//        for (Intege c : kids) {
//            if (c + extraCandies >= max) {
//                result.add(true);
//            } else {
//                result.add(false);
//            }
//        }

        return result;
    }
}
