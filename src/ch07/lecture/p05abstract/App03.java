package ch07.lecture.p05abstract;

public class App03 {
}

abstract class Canids03 {
    public abstract void bark();
}

class Chihuahua03 extends Canids03 {
    // 추상메소드는 반드시 재정의해야함

    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

abstract class Wolf03 extends Canids03 {
    // 추상메소드 재정의 하지않으면 추상 클래스로 설정

}
