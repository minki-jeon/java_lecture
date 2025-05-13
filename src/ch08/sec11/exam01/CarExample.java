package ch08.sec11.exam01;

public class CarExample {
    //* Reference : [Book. 이것이 자바다] p.379
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();

        // run() 메소드 실행
        myCar.run();        // "한국 타이어~"

        // 타이어 객체 필드 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        // run() 메소드 실행 (다형성에 의해 실행 결과가 다름)
        myCar.run();        // "금호 타이어~"
    }
}
