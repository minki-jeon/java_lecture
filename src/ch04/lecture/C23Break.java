package ch04.lecture;

public class C23Break {
    public static void main(String[] args) {
        // break : 가장 가까운 반복문 (for, while, switch) 종료

        // label과 함께 사용하면 label이 붙은 반복문(for, while) 종료

        loop1:
        // label
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                if ((4 * i) + (5 * j) == 60) {
                    System.out.println("(" + i + ", " + j + ")");
                    break loop1;
                }

            }

        }


    }
}
