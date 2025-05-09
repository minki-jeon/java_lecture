package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    //* Reference : [Book. 이것이 자바다] p.270
    public C() {
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1;   // private
//        a.field3 = 1;   // default

        a.method1();
//        a.method2();    // private
//        a.method3();    // default
    }
}
