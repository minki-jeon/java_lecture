package ch13.lecture;

public class App09 {
    public static void main(String[] args) {
        MyClass09 a = new MyClass09();
        a.<Integer>action();
        a.<String>action();

        String v1 = a.<String>action1();
        String v2 = a.action1();        // 타입을 유추할 수 있으므로 <String> 생략 가능

        a.<Integer>action2(3);  //Integer
        a.action2(3);       //Integer

        a.action2("java");      // String
    }
}

class MyClass09 {
    public <T> void action() {

    }

    public <T> T action1() {
        return null;
    }

    public <T> void action2(T param) {

    }
}
