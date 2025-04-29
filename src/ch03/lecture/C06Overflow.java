package ch03.lecture;

public class C06Overflow {
    public static void main(String[] args) {
        int a = 2147483645;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);     // overflow

        int b = -2147483646;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b);     // under-overflow
    }
}
