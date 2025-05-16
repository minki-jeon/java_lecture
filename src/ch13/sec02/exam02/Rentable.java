package ch13.sec02.exam02;

public interface Rentable<P> {
    //* Reference : [Book. 이것이 자바다] p.577

    // return type = P
    P rent();
}
