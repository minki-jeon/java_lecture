package ch07.lecture.p03polymorphism;

public class App01 {
    public static void main(String[] args) {
        SuperClass01 a = new SuperClass01();
        SubClass011 b = new SubClass011();
        SuperClass01 c = a;
        SubClass011 d = b;
        SuperClass01 e = b;     // super타입변수에 sub 참조 가능 (자동형변환)
        System.out.println(a == c); // true
        System.out.println(d == b); // true
        System.out.println(e == b); // true
        System.out.println(d == e); // true

        SubClass012 f = new SubClass012();
        SuperClass01 g = f;         // 자동형변환
        System.out.println(g == f); // true
        SuperClass01 h = new SubClass012();     // 자동형변환

        // 참조 불가
        SuperClass01 i = new SuperClass01();
//        SubClass011 j = i;
//        SubClass012 k = i;

        SubClass011 l = new SubClass011();
//        SubClass012 m = l;
        SubClass012 n = new SubClass012();
//        SubClass011 o = n;
    }
}

// @formatter:off
class SuperClass01 {}
class SubClass011 extends SuperClass01 {}
class SubClass012 extends SuperClass01 {}
// @formatter:on