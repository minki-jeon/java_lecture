package ch08.lecture.p06etc;

public class App04 {
    public static void main(String[] args) {
        MyClass041 a = new MyClass041();
//        a.common();     // 접근을 원하지 않는 일 (기본 public -> private 설정)
    }
}

interface MyInterface04 {
    default void action1() {
        System.out.println("action1.code");
        common();
    }

    default void action2() {
        System.out.println("action2.code");
    }

    // private method
    private void common() {
        System.out.println("공통된 매우 긴 코드");
    }
}

class MyClass041 implements MyInterface04 {
}

class MyClass042 implements MyInterface04 {
}