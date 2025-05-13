package ch08.lecture.p05extends;

public class App01 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        System.out.println(a instanceof MyClass02);
        System.out.println(a instanceof MyInterface02);
        System.out.println(a instanceof MyInterface01);
        System.out.println(a instanceof MyInterface03);
        
    }
}

// @formatter:off
interface MyInterface01 {}
interface MyInterface02 {}
class MyClass01 implements MyInterface01, MyInterface02 {}

interface MyInterface03 extends MyInterface01, MyInterface02 {}
interface MyInterface04 extends MyInterface02 {}

class MyClass02 implements MyInterface03 {}