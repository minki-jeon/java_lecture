package ch16.sec05.exam01;

public class Computer {
    //* Reference : [Book. 이것이 자바다] p.710
    public static double staticMethod(double x, double y) {
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        return x * y;
    }
}
