package ch04.exercise;

public class Exercise05Break {
    public static void main(String[] args) {

        boolean flag = false;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((4 * i) + (5 * j) == 60) {
                    System.out.println("(" + i + ", " + j + ")");
                    flag = true;
                    break;          // 가장 가까운 반복문 종료
                }
                if (flag) break;
            }

        }

    }
}
