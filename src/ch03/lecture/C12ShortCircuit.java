package ch03.lecture;

public class C12ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        boolean r1 = ((a++) < 0) && ((b++) > 0);
        System.out.println("r1 = " + r1);
        System.out.println("a = " + a);     // 6
        System.out.println("b = " + b);     // 3    (b++는 연산되지 않는다)

        a = 5;
        b = 3;
        boolean r2 = ((a++) < 0) & ((b++) > 0);
        System.out.println("r2 = " + r2);
        System.out.println("a = " + a);     // 6
        System.out.println("b = " + b);     // 4

    }
}
