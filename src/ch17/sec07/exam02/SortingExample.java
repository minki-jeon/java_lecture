package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    //* Reference : [Book. 이것이 자바다] p.749
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(System.out::println);
        System.out.println();
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);
    }
}
