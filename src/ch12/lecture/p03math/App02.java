package ch12.lecture.p03math;

import java.util.Random;

public class App02 {
    public static void main(String[] args) {
        // Math.random() : 0.0d <= x < 1.0d 임의의 수 반환
        System.out.println(Math.random());
        double dice = Math.floor(Math.random() * 6) + 1;
        System.out.println("dice = " + dice);

        // Random 임의의 수 반환하는 객체
        Random r = new Random();
        // nextDouble() : 0.0d <= x < 1.0d 임의의 수 반환
        double v = r.nextDouble();
        System.out.println("v = " + v);

        // nextInt() : 임의의 정수 (대략 -21억~21억)
        int i = r.nextInt();
        System.out.println("i = " + i);

        // nextInt(bound) : 0 ~ bound-1 사이의 정수
        int i1 = r.nextInt(6);// 0, 1, 2, 3, 4, 5 중에 랜덤 반환
        System.out.println("i1 = " + i1);
        int i2 = r.nextInt(6) + 1;
        System.out.println("i2 = " + i2);
    }
}
