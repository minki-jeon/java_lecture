package ch06.sec13.exam03.package1;

public class B {
    //* Reference : [Book. 이것이 자바다] p.270
    public void method() {
        A a = new A();

        a.field1 = 1;
        a.field2 = 1;
//        a.field3 = 1;       // private

        a.method1();
        a.method2();
//        a.method3();        // private
    }
}
