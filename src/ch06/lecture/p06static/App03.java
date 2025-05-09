package ch06.lecture.p06static;

public class App03 {

}

class MyClass03 {
    static String address;
    static int height;

    int age;
    String name;

    static void work() {
        // static 멤버끼리 접근가능
        System.out.println(address + ", " + height);
        greeting();
    }

    static void greeting() {

    }

    static void staticMethod() {
        // 클래스메소드(멤버)에서 인스턴스멤버 접근 불가
//        go();
//        System.out.println(name);
    }

    void instanceMethod() {
        // 인스턴스메소드(멤버)에서 클래스멤버 접근 가능
        greeting();
        System.out.println(address);
    }

    void action() {
        System.out.println(this.name + "은 " + this.age + "세다");
        this.go();
    }

    void go() {

    }

}
