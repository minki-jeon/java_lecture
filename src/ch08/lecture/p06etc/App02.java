package ch08.lecture.p06etc;

public class App02 {
}

interface MyInterface02 {
    void action();

    // default method : interface에 있는 body가 있는 메소드 (추상메소드 x)
    default void method() {
        System.out.println("MyInterface02.method");
    }

    // 항상 public
    public default void hello() {
        System.out.println("MyInterface02.hello");
    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass022.action");
    }
}
