package ch17.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.777
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
//                .collect(Collectors.groupingBy(s -> s.getJob()));
//                .collect(Collectors.groupingBy(Member::getJob));
                .collect(groupingBy(Member::getJob));

        System.out.println("[개발자]");
        groupingMap.get("개발자").forEach(System.out::println);

        System.out.println();

        System.out.println("[디자이너]");
        groupingMap.get("디자이너").forEach(System.out::println);
    }
}
