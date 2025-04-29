package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        // 작은 타입 -> 큰 타입 변환 가능

        // 큰 타입 -> 작은 타입 변환은 오류 발생 가능성 존재
        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b);

        // 기본적으로 안됨, 강제로 해야함 (type casting)
        // 큰 타입의 변수 값이 변환할 작은 타입의 범위 내에 있다면 정상적으로 casting 가능
        a = (byte) b;
        System.out.println("a = " + a);

        b = 128;
        a = (byte) b;
        System.out.println("b = " + b);     // 128
        System.out.println("a = " + a);     // '-128' 출력 (= byte 127 + 1 = -128)

        b = 987;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);     // '-37' 출력


    }
}
