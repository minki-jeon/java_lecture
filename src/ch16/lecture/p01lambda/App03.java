package ch16.lecture.p01lambda;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        a.method();

        // method body 여러줄이면 {} 써야한다.
        MyInterface03 b = () -> {
            System.out.println("code11");
            System.out.println("code22");
        };
        b.method();
        // method body가 한 줄이면 생략 가능
        MyInterface03 c = () -> System.out.println("code99");
        c.method();
    }
}

@FunctionalInterface
interface MyInterface03 {

    // 파라미터 없는 메소드
    void method();
}
