package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App03 {
    public static void main(String[] args) {
        // Collections 클래스에 유용한 메소드들이 존재
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("react");
        list.add("spring");
        list.add("css");
        list.add("html");

        // max: 가장 큰 값 반환
        String max = Collections.max(list);
        System.out.println("max = " + max);

        // min: 가장 작은 값 반환
        String min = Collections.max(list);
        System.out.println("min = " + min);

        // reverse: 요소 반대로 정렬
        Collections.reverse(list);
        System.out.println(list);

        // sort: 요소 정렬
        Collections.sort(list);
        System.out.println();

        // shuffle: 요소 랜덤 정렬
        Collections.shuffle(list);
        System.out.println(list);

        // fill: 특정 요소로 모두 교체
        Collections.fill(list, "sql");
        System.out.println(list);
    }
}
