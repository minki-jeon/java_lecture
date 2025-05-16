package ch12.lecture.p05wrapper;

public class App03 {
    public static void main(String[] args) {
        int a = 3;
        Integer b = a;      // boxing

        Object c = b;       // boxing
        Object d = 3;       // 형변환+boxing

        int e = b;          // unboxing
//        int f = d;          // 불가
    }
}
