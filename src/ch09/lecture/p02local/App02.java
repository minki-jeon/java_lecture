package ch09.lecture.p02local;

public class App02 {
    void some() {
        // local variable (지역변수)
        // effectively final (final 특성을 가지고 있는 변수)
        int a = 5;

        class MyClass {
            void action() {
                // 감싸고있는 메소드 (some())의 지역변수(a)를 사용한다면
                // 그 지역변수(a)는 값이 변경되어서는 안된다.
                System.out.println(a);
            }
        }
//        a = 6;      // 값 변경 불가 (지역변수가 내부 중첩 클래스 내에서 사용하고 있는 경우)
    }
}
