package ch07.sec06.package1;

public class B {
    //* Reference : [Book. 이것이 자바다] p.305
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
}
