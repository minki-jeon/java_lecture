package leetcode.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        // Array -> List
        for (int n : arr) {
            input.add(n);
        }

        // 1. input 정렬
        // 2. 인접한 두 값의 차가 가장 적은 값을 구한다.
        // 3. 인접한 두 값의 차가 가장 (2)에서 구한 값과 같으면 두 값을 별도 List를 만들어서 결과 list에 추가

        // 정렬
        Collections.sort(input);

        // (Way 1)
        // 요소들 간의 값의 차이가 가장 적은 값
        int gap = input.get(1) - input.get(0);
        for (int i = 1; i < input.size() - 1; i++) {
            int n = input.get(i + 1) - input.get(i);
            if (gap > n) gap = n;
        }

        // 구한 gap의 값과 동일한 차이를 가지고 있는 요소들을 리스트화
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i++) {
            int n = input.get(i + 1) - input.get(i);
            if (gap == n) {
                List<Integer> li = new ArrayList<>();
                li.add(input.get(i));
                li.add(input.get(i + 1));
                result.add(li);
            }
        }

        // (Way 2)
        // List<List<Integer>> result = new ArrayList<>();
        // int min = Integer.MAX_VALUE;

        // // 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        // for (int i = 0; i < input.size() - 1; i++) {
        //     Integer n1 = input.get(i);
        //     Integer n2 = input.get(i + 1);

        //     int diff = n2 - n1;

        //     min = Math.min(min, diff);
        // }

        // // 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        // for (int i = 0; i < input.size() - 1; i++) {
        //     Integer n1 = input.get(i);
        //     Integer n2 = input.get(i + 1);
        //     int diff = n2 - n1;
        //     if (diff == min) {
        //         //    두 값을 원소로 갖는 List를 만들어서
        //         //    결과 list에 추가 하기
        //         List<Integer> row = new ArrayList<>();
        //         row.add(n1);
        //         row.add(n2);

        //         result.add(row);
        //     }
        // }

        return result;
    }
}
