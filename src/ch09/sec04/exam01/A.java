package ch09.sec04.exam01;

public class A {
    //* Reference : [Book. 이것이 자바다] p.404

    // 생성자
    A() {
        // local class
        class B {
        }

        // local 객체 생성
        B b = new B();
    }

    void method() {
        class B {
        }

        B b = new B();
    }
}
