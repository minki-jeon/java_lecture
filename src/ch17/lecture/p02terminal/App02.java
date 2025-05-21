package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App02 {
    public static void main(String[] args) {
        // Optional
        // 최종 연산의 리턴 값 중 존재하지 않을 수 있는 경우 Optional을 리턴
        // Optional은 값이 없을 수 있다.
        List<Integer> list = List.of(2, 4, 6, 8, 10);

        Optional<Integer> max = list.stream()
                .filter(a -> a < 5)
                .max(Integer::compareTo);
        System.out.println("max = " + max);

        Optional<Integer> max1 = list.stream()
                .filter(a -> a % 2 == 1)
                .max(Integer::compareTo);
        System.out.println("max1 = " + max1);

        //
        Optional<Integer> o1 = Optional.of(10);
        Optional<Object> o2 = Optional.empty();

        // Optional.get() : 값을 반환
        Integer v1 = o1.get();
        System.out.println("v1 = " + v1);
//        Object v2 = o2.get();   // exception
//        System.out.println("v2 = " + v2);

        // Optional.orElse(n) : 값이 존재하지 않을 때, n을 반환
        Integer v3 = o1.orElse(0);
        System.out.println("v3 = " + v3);
        Object v4 = o2.orElse(0);
        System.out.println("v4 = " + v4);

        // 값 존재 여부 확인
        System.out.println("o1.isEmpty() = " + o1.isEmpty());       // false
        System.out.println("o2.isEmpty() = " + o2.isEmpty());       // true
        System.out.println("o1.isPresent() = " + o1.isPresent());   // true
        System.out.println("o2.isPresent() = " + o2.isPresent());   // false

    }
}
