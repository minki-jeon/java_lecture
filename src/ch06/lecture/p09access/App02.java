package ch06.lecture.p09access;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.age = 33;             // default 접근 가능
//        a.name = "java";      // private 접근 불가
    }
}

class MyClass02 {
    int age;

    // private 객체 내에서만 접근 가능
    private String name;

    void action() {
        System.out.println(name);       // 같은 객체 private 접근 가능
    }
}
