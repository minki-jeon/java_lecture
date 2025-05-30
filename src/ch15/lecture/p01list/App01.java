package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // Collection: 객체를 저장한 객체(의 타입)
        // Collection Framework: 객체를 저장한 객체의 타입(클래스, 인터페이스)와 관련된 메소드의 모음

        // List : 저장된 요소의 순서가 있다.
        // Set : 중복된 요소를 저장하지 않는다.
        // Map : 키(key)를 값(value)에 매핑한다.
        // Stack : 마지막에 들어간 객체가 먼저 출력된다. (LIFO; Last In First Out)
        // Queue : 먼저 들어간 객체가 먼저 출력된다. (FIFO; First In First Out)

        // List
        List<String> list = new ArrayList<>();
        System.out.println(list);

        // 요소(element) 추가
        list.add("java");
        System.out.println(list);
        list.add("spring");
        System.out.println(list);
        list.add("react");
        System.out.println(list);
        // 중복값 저장 가능
        list.add("java");
        System.out.println(list);
        // 특정 위치에 저장
        list.add(1, "sql");
        System.out.println(list);
        // 특정 위치의 요소 교체
        list.set(2, "vue");
        System.out.println(list);

        // 요소의 개수 확인
        int size = list.size();
        System.out.println("size = " + size);

        // 특정 요소 있는지 확인
        boolean r1 = list.contains("spring");
        System.out.println("r1 = " + r1);
        boolean r2 = list.contains("vue");
        System.out.println("r2 = " + r2);

        // 특정 위치의 요소 얻기
        String e1 = list.get(0);
        System.out.println("e1 = " + e1);
        String e2 = list.get(3);
        System.out.println("e1 = " + e1);
        String e3 = list.getLast();
        System.out.println("e3 = " + e3);
        String e4 = list.get(list.size() - 1);
        System.out.println("e4 = " + e4);

        // 특정 요소 삭제
        list.remove("vue");
        System.out.println(list);
        list.remove("java");
        System.out.println(list);

        // 특정 위치의 요소 삭제
        String e5 = list.remove(0);
        System.out.println("e5 = " + e5);
        System.out.println(list);
    }
}
