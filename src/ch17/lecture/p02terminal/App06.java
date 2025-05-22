package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App06 {
    public static void main(String[] args) {
        // groupingBy: 요소들을 그룹으로 묶음
        // Return-Type : Map<Key, List<E>>

        List<String> list = List.of("java", "spring", "css", "html", "react", "javascript");

        Map<String, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(s -> s.length() % 2 == 0 ? "짝" : "홀"));
        result.entrySet()
                .forEach(System.out::println);

    }
}
