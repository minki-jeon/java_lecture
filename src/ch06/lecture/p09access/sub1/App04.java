package ch06.lecture.p09access.sub1;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();      // 같은 패키지의 객체
//        a.age = 3;    // private 접근 불가
        a.email = "gmail";      // public
        a.home = "seoul";       // defualt

    }
}
