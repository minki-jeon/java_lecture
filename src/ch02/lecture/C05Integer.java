package ch02.lecture;

public class C05Integer {
    public static void main(String[] args) {
        // 정수형
        // byte(1 byte, 8 bits, BYTE)
        byte a;
        a = 127;    // 최대값 (2^8/2 = 0~127)
        System.out.println("a = " + a);
        a = -128;   // 최소값 (2^8/2 = -1 ~ -128)
        System.out.println("a = " + a);

        // short(2 bytes, 16 bits, WORD)
        short b;
        b = 32767;  // 최대값
        System.out.println("b = " + b);
        b = -32768; // 최소값
        System.out.println("b = " + b);

        // int(4 bytes, 32 bits, DWORD)
        int c;
        c = 2147483647;     // 최대값
        System.out.println("c = " + c);
        c = -2147483648;    // 최소값
        System.out.println("c = " + c);

        // long(8 bytes, 64 bits, QWORD)
        long d;
        d = 9223372036854775807L;
        System.out.println("d = " + d);
        d = -9223372036854775808L;
        System.out.println("d = " + d);

        // 기본적으로 java 코드에서 정수 literal는 int로 해석
        // long type literal은 끝에 L(l) 붙여야 한다.
        

    }
}
