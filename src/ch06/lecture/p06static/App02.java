package ch06.lecture.p06static;

public class App02 {
    public static void main(String[] args) {
        System.out.println(MyClass02.number);       // 클래스필드
        MyClass02 a = new MyClass02();
        System.out.println("a.age = " + a.age);     // 인스턴스필드
    }
}

class MyClass02 {
    // static field
    // 정적필드는 바로 초기값 설정한다.
    static int number = 100;

    // static block
    static {
        // static-field 초기값 설정을 위한 코드 작성
        int a = 3;
        if (true) {
            a *= 10;
        }
        number = a;
    }

    // instance field
    int age;

    // 생성자를 통해 인스턴스 필드의 초기값 설정한다.
    MyClass02() {
        int a = 3;
        if (true) {
            a = a * 10;
        }
        this.age = a;
    }
}
