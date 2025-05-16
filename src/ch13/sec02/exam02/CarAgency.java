package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
    //* Reference : [Book. 이것이 자바다] p.579

    // Rentable<P> -> Rentable<Car>
    @Override
    public Car rent() {
        // return type = Car
        return new Car();
    }
}
