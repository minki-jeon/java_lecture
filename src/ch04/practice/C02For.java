package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------");

        // 0 2 4 6 8
        // 2 4 6 8 10
        // 4 3 2 1 0
        // 5 4 3 2 1
        // * * * * *
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 4; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
