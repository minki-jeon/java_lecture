package ch09.sec02.exam01;

public class A {
    //* Reference : [Book. 이것이 자바다] p.397

    // 인스턴스 멤버 클래스
    class B {
    }

    // 인스턴스 필드값으로 B 객체 대입
    B field = new B();

    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}
