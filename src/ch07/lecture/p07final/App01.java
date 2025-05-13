package ch07.lecture.p07final;

public class App01 {

}

class Parent01 {
    public void action1() {

    }

    // final method: 오버라이드(재정의) 불가
    final public void action2() {

    }
}

class Child011 extends Parent01 {
    // final 키워드의 메소드는 상속받지 못한다.
//    @Override
//    public void action2() {
//        super.action2();
//    }

    @Override
    public void action1() {
        super.action1();
    }
}