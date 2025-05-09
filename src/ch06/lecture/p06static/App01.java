package ch06.lecture.p06static;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.name = "donald";
        a.age = 77;

        MyClass01 b = new MyClass01();
        b.name = "musk";
        b.age = 55;

        // 인스턴스 멤버는 클래스 이름으로 접근 불가
//        MyClass01.name = "abc";
//        MyClass01.age = 22;
        // 클래스 멤버(필드, 메소드)는 클래스 이름으로 접근 가능
        MyClass01.address = "ny";

    }
}

class MyClass01 {
    // Member (Field, Method, [Constructor])
    // Field (멤버필드, 인스턴스필드)
    String name;
    int age;

    // Class-Field
    static String address;

    // Method (멤버메소드, 인스턴스메소드)
    void work() {
        System.out.println(this.age + "세 의 " + this.name + "가 일한다.");
    }

    static void print() {
        System.out.println(address + "에 삽니다.");
    }
}
