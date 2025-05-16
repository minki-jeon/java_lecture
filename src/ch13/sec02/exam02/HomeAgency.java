package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    //* Reference : [Book. 이것이 자바다] p.578

    // Rentable<P> -> Rentable<Home>
    @Override
    public Home rent() {
        // return type = Home
        return new Home();
    }
}
