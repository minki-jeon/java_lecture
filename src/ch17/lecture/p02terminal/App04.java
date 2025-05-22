package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App04 {
    public static void main(String[] args) {
        // reduce 집계 연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        // 모든 요소 연결 // reduce(arg1, arg2) 중에서 arg1은 초기값 지정
        String r1 = list.stream().reduce("", (a, b) -> a + b);
        System.out.println("r1 = " + r1);       // javaspringcsshtmlsql

        Integer r2 = list.stream()
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);

        System.out.println("r2 = " + r2);

    }
}
