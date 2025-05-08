package ch06.lecture.p04member;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.print();
    }
}

class MyClass02 {
    // 필드
    String name = "머스크";
    int age = 99;

    // 메소드
    void print() {
        // local variable(지역변수) : 메소드 내에서 선언된 변수들
        int a = 3;
        String address = "seoul";
        String name = "도날드";

        // this : 멤버에 접근하기 위한 키워드
        // this.field
        // this.method()
        System.out.println("이름: " + name);
        System.out.println("this.이름: " + this.name);
        System.out.println("this.나이: " + this.age);
        // 가리고 있는 지역변수가 없으면 this 생략 가능
        System.out.println("나이: " + age);
    }
}