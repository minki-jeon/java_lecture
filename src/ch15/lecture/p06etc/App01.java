package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        // ArrayList : 내부에 Array 사용
        // - 장점: 중간 요소 검색 빠른 편
        // - 단점: 중간 요소 삽입/삭제 비용 큰 편
        // LinkedList : 내부에 doubly linked list (양쪽으로 역녈된 객체들) 사용
        // - 장점: 중간 요소 삽입/삭제 비용이 적은 편
        // - 단점: 중간 요소 검색 느린 편

        long s1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            list1.add(0, "java");
            list1.add("java");
        }
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            list2.add(0, "java");
            list2.add("java");
        }
        long e2 = System.nanoTime();

        System.out.println("arraylist 요소 추가 소요 시간: " + (e1 - s1));
        System.out.println("linkedlist 요소 추가 소요 시간: " + (e2 - s2));

    }
}
