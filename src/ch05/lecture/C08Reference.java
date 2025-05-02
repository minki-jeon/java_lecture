package ch05.lecture;

import java.sql.SQLOutput;

public class C08Reference {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] c = {5, 6};
        int[] d = {5, 6};

        System.out.println("c[0] = " + c[0]);
        System.out.println("d[0] = " + d[0]);

        System.out.println("--------------------------");
        int e = 7;
        int f = e;

        int[] g = {9, 1};
        int[] h = g;

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g[0] = " + g[0]);
        System.out.println("h[0] = " + h[0]);

        // 기본타입 변수 값 변경
        e = 77;
        System.out.println("e = " + e);     //77
        System.out.println("f = " + f);     //7

        // 참조타입 변수 값 변경
        g[0] = 99;
        System.out.println("g[0] = " + g[0]);   //99
        System.out.println("h[0] = " + h[0]);   //99

    }
}
