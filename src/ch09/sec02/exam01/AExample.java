package ch09.sec02.exam01;

public class AExample {
    //* Reference : [Book. 이것이 자바다] p.398
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();
    }
}
