package ch07.lecture.p06super;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();
        System.out.println(a);
    }
}

class Parent02 {
    // private 필드

    public Parent02() {
        // 상위 클래스 생성자가 해야하는 동작
        // = private 필드 초기화
        System.out.println("부모 클래스 필드 초기화");
    }
}

class Child021 extends Parent02 {
    public Child021() {
        // 상위 클래스의 생성자 호출 코드가 반드시 있어야한다.
        // 작성하지 않으면 상위 클래스~~~~~~~~~~~~~
//        super();

        // 하위 클래스 생성자가 하는 동작
        System.out.println("자식 클래스 필드 초기화");
    }
}
