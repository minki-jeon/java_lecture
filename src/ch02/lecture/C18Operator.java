package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {
        // 동일 타입
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println("c = " + c);

        // 다른 타입끼리 산술 연산 - 연산 결과는 큰 타입으로 반환
        int d = 10;
        long e = 20;
//        int f = d + e;      // error
        long g = d + e;

        int h = 3;
        double i = 3.14;
        double j = h + i;

        // byte, short, int 타입은 동일한 타입 간의 연산이더라도 int 타입으로 결과 반환
        byte k = 5;
        int l = 7;
        int m = k + l;      // int

        byte n = 7;
        byte o = 9;
//        byte p = n + o;   // error
        int q = n + o;

        int r = 5;
        int s = 3;
        int t = r / s;   // 1.6666.. (return type int)
        System.out.println("t = " + t);     // 1
        double u = r / s;
        System.out.println("u = " + u);     // 1

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);     // 1.6666..
        System.out.println("w = " + w);     // 1.6666..
    }
}
