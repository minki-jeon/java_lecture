package ch17.lecture.p01stream;

import java.util.List;
import java.util.stream.Stream;

public class App03 {
    public static void main(String[] args) {
        // Stream: 데이터 흐름
        List<Integer> list = List.of(8, 5, 6, 1, 2, 3);
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = stream1.filter(i -> i % 2 == 0);
        long count = stream2.count();

        System.out.println("count = " + count);

        // stream은 재사용할 수 없다. (연산이 끝나면 닫히고 다시 연산할 수 없다.)
//        stream1.filter(i -> i % 2 == 0);      // exception 발생

        // 추가로 다른 연산을 할 시 stream을 처음부터 다시 생성해야한다.
        Stream<Integer> stream3 = list.stream();
        Stream<Integer> stream4 = stream3.filter(i -> i % 2 == 1);
        long count1 = stream4.count();
        System.out.println("count1 = " + count1);

    }
}
