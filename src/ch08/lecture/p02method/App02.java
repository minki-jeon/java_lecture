package ch08.lecture.p02method;

public class App02 {
}

interface MyInterface02 {
    // interface 대부분 메소드는 public abstract method
    public abstract void action1();

    // public abstract 생략 가능
    public abstract void action2();

    abstract void action3();

    public void action4();
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action1() {

    }

    // 자동완성 : [Alt+Instert] > [implement Methods..]
    @Override
    public void action2() {

    }

    @Override
    public void action3() {

    }

    @Override
    public void action4() {

    }
}
