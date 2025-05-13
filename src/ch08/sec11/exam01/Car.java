package ch08.sec11.exam01;

public class Car {
    //* Reference : [Book. 이것이 자바다] p.379
    // 필드
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    // 메소드
    void run() {
        tire1.roll();
        tire2.roll();
    }
}
