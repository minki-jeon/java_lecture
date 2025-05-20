package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //* Reference : [Book. 이것이 자바다] p.692
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;     // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0;       // 최고 점수를 저장하는 변수
        int totalScore = 0;     // 점수 합계를 저장하는 변수

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            totalScore += v;
            if (v > maxScore) {
                maxScore = v;
                name = entry.getKey();
            }
        }
        System.out.println("평균 점수: " + (totalScore / map.size()));
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
