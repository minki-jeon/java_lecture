package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.HashMap;
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

        // List - 고전적 for
        List<Student> mList = new ArrayList<>();
        for (Student s : totalList) {
            if (s.getSex().equals("남")) {
                mList.add(s);
            }
        }
        for (Student s : mList) {
            System.out.println(s);
        }


        // 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
//                                s -> s.getName(),
//                                s -> s.getScore()
                                Student::getName,
                                Student::getScore
                        )
                );
        System.out.println(map);
        // 출력
        map.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        // Map - 고전적 for
        Map<String, Integer> map1 = new HashMap<>();
        for (Student s : maleList) {
            map1.put(s.getName(), s.getScore());
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
