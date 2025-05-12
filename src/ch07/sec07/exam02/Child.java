package ch07.sec07.exam02;

public class Child extends Parent {
    //* Reference : [Book. 이것이 자바다] p.311
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}
