package ch17.sec12.exam01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    //* Reference : [Book. 이것이 자바다] p.763
    public static void main(String[] args) {
        List<Student> totalList = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        // 남학생만 묶어 List 생성
        /*
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());
    */
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);


    }
}
