package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App05 {
    public static void main(String[] args) {
        // collect : 요소들을 수집해서 Collection(List, Set, Map)을 결과로 생성

        List<String> list = List.of("java", "spring", "css", "react", "html");

        // List로 수집
        List<Integer> c1 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println("c1 = " + c1);

        // set으로 수집
        Set<Integer> c2 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toSet());
        System.out.println("c2 = " + c2);

        // map으로 수집
        Map<String, Integer> c3 = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println("c3 = " + c3);

        // list 변환 작업이 많기 때문에 toList 메소드 사용 가능
        List<Integer> c4 = list.stream()
                .map(s -> s.length())
                .toList();
        System.out.println("c4 = " + c4);

    }
}
