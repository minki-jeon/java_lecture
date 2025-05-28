package ch12.sec12;

public class Service {
    //* Reference : [Book. 이것이 자바다] p.561
    @PrintAnnotation
    public void method1() { // value default "-", number default 15
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*")   // number default 15
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
