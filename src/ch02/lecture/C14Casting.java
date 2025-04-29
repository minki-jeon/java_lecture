package ch02.lecture;

public class C14Casting {
    public static void main(String[] args) {
        // 타입 변환 - 정수형 작은 메모리 변수타입이 큰 메모리 변수 타입으로 변환 가능
        byte a = 3;     // 1byte
        short b = 100;  // 2bytes
        int c = 200;    // 4bytes
        long d = 300L;  // 8bytes

        b = a;
        c = a;
        d = a;

        c = b;
        d = b;

        d = c;

        // 정수형의 값을 실수형에 옮겨 닮는 것 가능
        byte e = 3;
        short f = 4;
        int g = 9;
        long h = 10L;

        float i;
        double j;

        i = e;
        i = f;
        i = g;
        i = h;

        j = e;
        j = f;
        j = g;
        j = h;

        // 실수형 작은 타입에서 큰 타입으로 옮기기 가능
        float k = 3.14F;
        double l = 3.14;
        l = k;

        // char -> int, long 변환 가능
        char m = '가';
        int n = m;
        long o = m;

        // char -> short 변환 불가 (short은 양수와 음수까지 저장하는 타입이므로)
//        short p = m;
    }
}
