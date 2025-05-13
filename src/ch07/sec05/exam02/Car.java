package ch07.sec05.exam02;

public class Car {
    //* Reference : [Book. 이것이 자바다] p.302
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
