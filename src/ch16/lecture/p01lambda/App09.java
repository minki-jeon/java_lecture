package ch16.lecture.p01lambda;

public class App09 {
    public static void main(String[] args) {
        MyInterface09 o = (a, b, c) -> a.action(b, c);
//        MyInterface09 o = new MyInterface09() {
//            @Override
//            public void some(MyClass09 a, int b, int c) {
//                a.action(b, c);
//            }
//        };
        MyInterface09 s = MyClass09::action;

        // 객체 생성, 호출
        MyClass09 obj = new MyClass09();
        o.some(obj, 10, 20);
        s.some(obj, 30, 40);
    }
}

class MyClass09 {
    void action(int a, int b) {
        System.out.println("MyClass09.action");
    }
}

@FunctionalInterface
interface MyInterface09 {
    void some(MyClass09 a, int b, int c);
}