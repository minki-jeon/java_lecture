package ch07.lecture.p06super;

public class App03 {
    public static void main(String[] args) {
        Child031 a = new Child031();
    }
}

class Parent03 {
    public Parent03(int a) {
        System.out.println("하위 필드 초기화");
    }
}

class Child031 extends Parent03 {
    public Child031() {
//        super();
        // 상위 클래스에 기본 생성자(파라미터없는 생성자)가 존재하지 않으면
        // 명시적으로 상위 클래스의 생성자 호출 코드를 작성해야한다.
        super(3);   // 상위 클래스 생성자 호출
        System.out.println("하위 필드 초기화");
    }
}