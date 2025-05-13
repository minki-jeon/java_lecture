package ch08.sec12;

public class InstanceofExample {
    //* Reference : [Book. 이것이 자바다] p.385
    public static void main(String[] args) {

        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스 매개변수 메소드
    public static void ride(Vehicle vehicle) {
        // 방법1
        if (vehicle instanceof Bus) {
            // 강제형변환
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        // 방법2 (Java 12~)
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }
    }
}
