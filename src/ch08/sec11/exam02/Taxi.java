package ch08.sec11.exam02;

public class Taxi implements Vehicle {
    //* Reference : [Book. 이것이 자바다] p.383

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
