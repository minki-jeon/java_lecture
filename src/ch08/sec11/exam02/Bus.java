package ch08.sec11.exam02;

public class Bus implements Vehicle {
    //* Reference : [Book. 이것이 자바다] p.382
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
