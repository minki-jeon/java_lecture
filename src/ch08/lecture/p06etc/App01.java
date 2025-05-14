package ch08.lecture.p06etc;

public class App01 {
    public static void main(String[] args) {
        System.out.println(MyInterface01.AGE);
        System.out.println(MyInterface01.HOME_ADDRESS);
    }
}

interface MyInterface01 {
    // public static final (상수) 필드
    // - 인터페이스는 인스턴스로 생성이 불가하기에 기본적으로 public static final 적용된다.
    public static final int AGE = 1;
    String HOME_ADDRESS = "seoul";

    // public 추상메소드
}
