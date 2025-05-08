package ch06.lecture.p05constructor;

public class App05 {

}

class MyClass05 {
    String name;
    String email;
    int age;
    boolean done;

    // 생성자는 여러개 구현 가능
    // 구현하는 생성자들은 파라미터 수, 타입, 순서가 달라야 한다.

    public MyClass05(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public MyClass05(int age, boolean done) {
        this.age = age;
        this.done = done;
    }

    public MyClass05(String name) {
        this.name = name;
    }
    // 파라미터 수가 달라야 한다
//    public MyClass05(String email) {
//        this.email = email;
//    }

    public MyClass05(String name, String email, int age, boolean done) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.done = done;
    }
}
