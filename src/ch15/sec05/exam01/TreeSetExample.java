package ch15.sec05.exam01;

import com.sun.source.util.Trees;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    //* Reference : [Book. 이것이 자바다] p.668
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.println(s + " ");    // 75 80 87 95 98
        }
        System.out.println("\n");

        // 특정 Integer 객체
        System.out.println("가장 낮은 점수: " + scores.first());                      // 75
        System.out.println("가장 높은 점수: " + scores.last());                       // 98
        System.out.println("95점 아래 점수: " + scores.lower(95));               // 87
        System.out.println("95점 위의 점수: " + scores.higher(95));              // 98
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));     // 95
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");     // 87

        // 내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        // 범위 검색 (80 <= )
        NavigableSet<Integer> rangSet = scores.tailSet(80, true);
        for (Integer s : rangSet) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        // 범위 검색 ( 80 <= score <90)
        rangSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangSet) {
            System.out.println(s + " ");
        }


    }

}
