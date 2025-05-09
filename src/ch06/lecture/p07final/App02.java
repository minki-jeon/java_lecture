package ch06.lecture.p07final;

public class App02 {
    public static void main(String[] args) {
        // static final field 사용 주요 항목
        // integer 최대값, 최소값
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

class MyClass02 {
    // static field + final 키워드 : 값을 단 한번만 대입
    // static field 명은 일반적으로 대문자_로 작성 (UPPER_SNAKE_CASE)
    final static int HEIGHT = 99;
    final static int WEIGHT;
    static final String COMPANY_NAME = "apple";

    static {
        WEIGHT = 100;
//        HEIGHT = 101;
    }

    final int age;

    public MyClass02(int age) {
        this.age = age;
    }
}
