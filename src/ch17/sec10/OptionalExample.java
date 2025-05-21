package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    //* Reference : [Book. 이것이 자바다] p.758
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list = List.of();

        // 예외 발생 (NoSuchElementException)
//        double avg = list.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();

        // 방법1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();                                 // Stream 최종연산
        if (optional.isPresent()) {
            System.out.println("방법1_평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0");
        }

        // 방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()                              // Stream 최종연산
                .orElse(0.0);                   // Optional chaining
        System.out.println("방법2_평균: " + avg);

        // 방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }
}
