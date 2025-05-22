package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class CollectExample {
    //* Reference : [Book. 이것이 자바다] p.767
    public static void main(String[] args) {
        List<Student> totalList = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

//        Map<String, Double> result = totalList.stream()
//                .collect(Collectors.groupingBy(s -> s.getSex(),
//                        Collectors.averagingDouble(s -> s.getScore())));
        Map<String, Double> result = totalList.stream()
                .collect(groupingBy(Student::getSex,
                        averagingDouble(Student::getScore)));
        System.out.println(result);
    }
}
