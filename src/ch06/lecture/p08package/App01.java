package ch06.lecture.p08package;

// package : 클래스가 소속된 위치. 폴더 경로와 일치
// Class의 Full-Name: package + class name

public class App01 {
    public static void main(String[] args) {
        ch06.lecture.p08package.MyClass01 a = new ch06.lecture.p08package.MyClass01();
        ch06.lecture.p08package.sub1.MyClass01 b = new ch06.lecture.p08package.sub1.MyClass01();
        MyClass01 c = new MyClass01();
    }
}
