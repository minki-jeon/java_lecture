package ch06.lecture.p01class;

public class App01 {
    public static void main(String[] args) {
        String b = new String("java");

        MyClass01 a = new MyClass01();
        MyClass01 c = new MyClass01();

        System.out.println(a == c);     // false : 참조값이 다르다.

        MyClass02 d = new MyClass02();


    }
}
