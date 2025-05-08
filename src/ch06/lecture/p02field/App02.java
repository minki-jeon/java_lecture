package ch06.lecture.p02field;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.address = "Seoul";
        System.out.println("a.address = " + a.address);
        System.out.println("a.name = " + a.name);
        System.out.println("a.age = " + a.age);

    }
}

class MyClass02 {
    // 필드 작성 시 기본값 설정 가능 (권장되지않음)
    String address;
    String name = "홍길동";
    int age = 1;
    String email = "없음";

}
