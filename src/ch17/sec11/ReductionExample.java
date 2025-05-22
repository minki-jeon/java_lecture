package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    //* Reference : [Book. 이것이 자바다] p.760
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("김자바", 88)
        );
        // 방법1
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        // 방법2
        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        // 학생들 점수 합계
        Arrays list;
        Integer r2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);
        System.out.println("r2 = " + r2);

        int r1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("r1 = " + r1);


    }
}
