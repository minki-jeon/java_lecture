package etc.lecture.p01var;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 5;

        // var : 변수의 타입이 추론 가능할 때 사용 가능
        var c = 7;          // int
        var d = 7L;         // long
//        var e;            // 사용 불가
        var f = "java";     // String

        // List<Integer> 추론 가능
        List<Integer> list = List.of(9, 1, 2);
        var list2 = List.of(9, 1, 2);

        // ArrayList<String> 추론 가능
        ArrayList<String> list3 = new ArrayList<>();
        var list4 = new ArrayList<String>();

    }
}
