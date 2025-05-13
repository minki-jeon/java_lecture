package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    //* Reference : [Book. 이것이 자바다] p.306
    public D() {
        // A() 생성자 호출
        super();
    }

    public void method1() {
        // A 필드값 변경
        this.field = "value";
        // A 메소드 호출
        this.method();
    }

    public void method2() {
        // protected 상속 클래스의 객체(인스턴스) 생성 불가
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
