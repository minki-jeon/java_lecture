package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
    //* Reference : [Book. 이것이 자바다] p.305
    public void method() {
        // 다른패키지에서 상속관계가 아닌 protected 멤버에 접근 불가
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
