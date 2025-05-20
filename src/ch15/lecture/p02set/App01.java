package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // Set: 같은 객체를 여러번 저장할 수 없다. (중복 저장 불가)
        // HashSet: 탐색 순서가 보장되지 않는다.
        Set<String> set = new HashSet<>();

        // 요소(element) 추가
        set.add("java");
        boolean r1 = set.add("spring");
        System.out.println("r1 = " + r1);   // true
        set.add("html");
        System.out.println(set);
        set.add("css");
        System.out.println(set);
        boolean r2 = set.add("spring");
        System.out.println("r2 = " + r2);   // false
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);

        // 요소 삭제
        boolean r3 = set.remove("spring");
        System.out.println("r3 = " + r3);   // true
        System.out.println(set);
        set.remove(null);
        System.out.println(set);
        boolean r4 = set.remove("react");
        System.out.println("r4 = " + r4);   // false
        System.out.println(set);

        // 요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);
        boolean r5 = set.isEmpty();
        System.out.println("r5 = " + r5);
        boolean r6 = set.isEmpty();


        // 전체 탐색


    }
}
