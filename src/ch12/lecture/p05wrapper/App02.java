package ch12.lecture.p05wrapper;

public class App02 {
    public static void main(String[] args) {
        // Wrapper 클래스의 참조변수는 null 저장해야하며 equals로 비교해야한다.

        int a = 3;
        int b = 0;

        Integer c = 3;
        Integer d = 0;

        Integer e = null;   // 참조타입 변수에 null 주입 가능

        int f = 30000;
        int g = 30000;
        System.out.println(f == g);     // true

        Integer h = 30000;
        Integer i = 30000;
        System.out.println(h == i);     // false    (참조값 다름)
        System.out.println(System.identityHashCode(h));
        System.out.println(System.identityHashCode(i));

        Integer j = 3;
        Integer k = 3;
        System.out.println(j == k);
        System.out.println(j.equals(k));
    }
}
