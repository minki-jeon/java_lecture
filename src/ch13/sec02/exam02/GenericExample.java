package ch13.sec02.exam02;

public class GenericExample {
    //* Reference : [Book. 이것이 자바다] p.579

    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
