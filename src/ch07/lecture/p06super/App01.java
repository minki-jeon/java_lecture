package ch07.lecture.p06super;

public class App01 {

}

class Parent01 {
    public void action1() {

    }

    public void action2() {
        System.out.println("상위 클래스 액션");
    }

    public void action3() {
        System.out.println("상위 클래스 액션3");
    }
}

class Child011 extends Parent01 {
    // super: 상위 클래스의 멤버에 접근하기 위한 클래스
    @Override
    public void action3() {
        // 추가 동작 코드
        System.out.println("재정의한 액션 3-1");
        super.action3();        // 상위 클래스 접근
        System.out.println("재정의한 액션 3-2");

    }

    @Override
    public void action2() {
        System.out.println("재정의한 액션2");
    }

    public void method1() {
        this.method2();
        method2();

        this.action1();
        action1();
        // 재정의한 메소드
        this.action2();
        action2();
        // 상위 클래스 메소드
        super.action2();
    }

    public void method2() {
    }
}
