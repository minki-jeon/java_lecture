package ch06.lecture.p03method;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.action();
        a.sum(3, 5);
        a.sum(10, 20, 30);
    }

}

class MyClass04 {
    void action() {
        System.out.println("어떤 코드");
    }

    // Method Overloading: 같은 이름의 메소드 작성 (파라미터의 수, 타입, 순서가 다른)
    void sum(int a, int b) {
        System.out.println("받은 값을 더함");
        System.out.println(a + b);
    }

    void sum(double a, int b) {

    }

    void sum(int a, double b) {

    }

    // 파라미터 이름은 오버로딩과 관련없다.
//    void sum(int c, double d) {
//    }
    void sum(double a, double b) {

    }

    void sum(int a, int b, int c) {
        System.out.println("여러 값을 더함");
        System.out.println(a + b + c);
    }
}
