package ch03.lecture;

public class C08DivideByZero {
    public static void main(String[] args) {
        // 0 으로 나누기
        int a = 5;
        int b = 0;

        // 정수 타입은 0으로 나눌 수 없음
//        int c = a / b;
//        System.out.println("c = " + c);   // Error

        double c = 5.0;
        double d = 0.0;
        // 실수타입은 0으로 나누면 Infinity
        double e = c / d;
        System.out.println("e = " + e);

        // 실수타입을 0으로 나눈 나머지는 존재하지 않음 (NaN; Not a Number)
        double f = c % d;
        System.out.println("f = " + f);

        // Double.inInfinity() : 값이 Infinity인지 확인하는 메소드
        // Double.inNaN() : 값이 NaN인지 확인하는 메소드
        System.out.println("Double.isInfinite() = " + Double.isInfinite(e));
        System.out.println("Double.isNaN(f) = " + Double.isNaN(f));

    }
}
