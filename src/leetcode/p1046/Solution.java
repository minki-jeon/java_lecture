package leetcode.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 1. 정렬
        // 2. 마지막 index의 요소와 (마지막-1) index의 요소를 꺼내고(지우고)
        // 3. 차이를 구해서 list에 다시 넣고 (차이가 0 이면 넣지않는다.
        // 4. 1번부터 반복 (요소 하나만 남을 때까지)

        while (list.size() > 1) {
            Collections.sort(list);
            Integer last1 = list.removeLast();
            Integer last2 = list.removeLast();
            int n = last1 - last2;
            if (n > 0) list.add(n);
        }

        if (list.isEmpty()) return 0;

        return list.getFirst();
    }
}
