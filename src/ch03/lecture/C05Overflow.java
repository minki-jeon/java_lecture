package ch03.lecture;

public class C05Overflow {
    public static void main(String[] args) {

        int a = 10_0000_0000;               // 10억
        System.out.println("a = " + a);
        a = a * 2;
        System.out.println("a = " + a);
        a = a * 2;
        System.out.println("a = " + a);
        // int 타입으로 표현할 수 있는 수는 대략 21억 4천만까지이므로 40억을 표현하지 못한다.

        long b = 10_0000_0000;
        System.out.println("b = " + b);
        b = b * 2;
        System.out.println("b = " + b);
        b = b * 2;
        System.out.println("b = " + b);
    }
}
