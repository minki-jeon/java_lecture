package ch08.sec11.exam02;

public class DriverExample {
    //* Reference : [Book. 이것이 자바다] p.383
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 매개값으로 구현 객체 대입 (다형성에 의해 실행 결과가 다르게 출력)
        // 자동 타입 변환 -> 오버라이딩 메소드 호출 -> 다형성
        driver.drive(bus);
        driver.drive(taxi);
    }
}
