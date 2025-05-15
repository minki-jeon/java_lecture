package ch12.lecture.p03math;

import java.util.Random;

public class App03 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int d1 = random.nextInt(6) + 1;
            int d2 = random.nextInt(6) + 1;
            System.out.println(d1 + ", " + d2);
            if (d1 == d2) {
                System.out.println("당첨!");
                break;
            }
            System.out.println();
        }
    }
}
