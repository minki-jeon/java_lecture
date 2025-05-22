package ch17.exercise.p06;

import java.util.Arrays;
import java.util.List;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.774
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        // (1) 고전적 for (명령형)
        double sum1 = 0;
        for (Member member : list) {
            sum1 += member.getAge();
        }
        double avg1 = sum1 / list.size();
        System.out.println("avg1 = " + avg1);

        // (2) 참조타입 Stream
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("avg2 = " + avg2);

        // (3) 기본타입 stream
        double avg3 = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("평균 나이: " + avg3);
    }
}
