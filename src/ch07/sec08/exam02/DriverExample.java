package ch07.sec08.exam02;

public class DriverExample {
    //* Reference : [Book. 이것이 자바다] p.322
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
