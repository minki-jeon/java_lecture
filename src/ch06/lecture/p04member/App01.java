package ch06.lecture.p04member;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01();
        a.age = 30;
        b.age = 50;

        System.out.println("a.age = " + a.age);
        System.out.println("b.age = " + b.age);

        a.action();
        b.action();

        a.print();
        b.print();
    }
}

class MyClass01 {
    // Member = Field + Method (+생성자)
    // 멤버끼리 서로 사용 가능
    // field
    int age;

    // method
    void print() {
        System.out.println("나이: " + age);
        action();
    }

    void action() {
        System.out.println("action method");
    }

}
