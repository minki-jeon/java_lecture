package ch08.lecture.p03cast;

public class App02 {
    public static void main(String[] args) {
        MyClass021 a = new MyClass021();
        MyInterface02 b = a;
        MyClass021 c = (MyClass021) b;      // 다운캐스팅
        MyClass022 d = (MyClass022) b;      // ClassCastException

        System.out.println("프로그램 종료");
    }
}

// @formatter:off
interface MyInterface02 {}
class MyClass021 implements MyInterface02 {}
class MyClass022 implements MyInterface02 {}
