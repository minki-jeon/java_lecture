package ch06.lecture.p07final;

public class App01 {
}

class MyClass01 {

    final int weight;
    final int height = 9;   // final은 무조건 기본값 설정 필수
    int age;

    MyClass01() {
        age = 3;
        age = 5;

        weight = 99;    // 생성자에서 final 변수 기본값 설정 가능
    }

    MyClass01(int a) {
        weight = 88;
    }

    void method1() {
        int a;
        a = 3;
        int b = 5;

        // 값을 바꿔 넣을 수 있음
        a = 7;
        b = 11;

        // final : 변수에 값을 단 한번만 넣을 수 있다.
        final int c;
        c = 9;
//        c = 11;
    }

    void method2(int a) {
        System.out.println(a);
        a = 9;
    }

    void method3(final int a) {
        System.out.println(a);
//        a = 9;
    }
}
