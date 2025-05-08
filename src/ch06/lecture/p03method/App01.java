package ch06.lecture.p03method;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.age = 30;
        a.work();
        a.go();
        a.action();
    }
}

class MyClass01 {
    // field
    int age;

    // method
    // 작성 규칙: {Return_Type} {Method_Name} ({Parameters}) { }
    // 관습 : lowerCamelCase
    // 주로 동사(verb)로 시작
    void work() {
        System.out.println("일합니다.");
    }

    void go() {
        // 변수, 타입, 연산자, 제어문 등을 활용한 실행코드
        System.out.println("가는 중입니다.");
    }

    void action() {
        System.out.println("실행합니다.");
    }
}
