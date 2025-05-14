package ch16.lecture.p01lambda;

public class App01 {
    public static void main(String[] args) {
        MyInterface01 a = new MyInterface01() {
            // 추상메소드 재정의
            @Override
            public void method01() {
                System.out.println("App01.method01");
            }

            @Override
            public void method02() {
                System.out.println("App01.method02");
            }
        };
    }
}

interface MyInterface01 {
    void method01();

    void method02();
}
