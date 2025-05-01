package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */

        /*
         *****
         ****
         ***
         **
         *
         */

        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */

        // @formatter:off
        /*
              *
             **
            ***
           ****
          *****
         */

        /*
         *****
          ****
           ***
            **
             *
         */

        /*
        0
        01
        012
        0123
        01234
         */

        /*
        1
        12
        123
        1234
        12345
         */

        /*
        0
        12
        345
        6789
        01234
         */

        /*
        1
        23
        456
        7890
        12345
         */
        // @formatter:on

        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 7; i++) {
            for (int j = 6; j > 1; j--) {
                if (j < (i + 1)) System.out.print("#");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > 1; j--) {
                if (j < (i + 2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i < j + 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 2; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------------------");
        int n = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (n < 10) {
                    System.out.print(n);
                } else {
                    n = 0;
                    System.out.print(n);
                }
                n++;
            }
            System.out.println();
        }
        System.out.println("----------------------");
        int m = 1;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (m < 10) {
                    System.out.print(m);
                } else {
                    m = 0;
                    System.out.print(m);
                }
                m++;
            }
            System.out.println();
        }
    }
}
