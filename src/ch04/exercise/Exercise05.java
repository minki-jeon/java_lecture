package ch04.exercise;

public class Exercise05 {
    //* Reference : [Book. 이것이 자바다] p.140
    public static void main(String[] args) {
        // 4x + 5y = 60의 모든 해 (x, y)

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((4 * i) + (5 * j) == 60) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }

        }
    }
}
