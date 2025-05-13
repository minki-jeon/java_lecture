package ch07.sec05.exam02;

public class SportsCar extends Car {
    //* Reference : [Book. 이것이 자바다] p.302
    @Override
    public void speedUp() {
        speed += 10;
    }
    // 오버라이드 불가
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
