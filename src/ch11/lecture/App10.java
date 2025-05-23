package ch11.lecture;

public class App10 {
    public static void main(String[] args) {
        String a = "java";
        String b = null;

        System.out.println("a.length() = " + a.length());
        if (b != null) {
            System.out.println("b.length() = " + b.length());
        }
        System.out.println("프로그램 계속 진행");


        int c = 3;
        int d = 5;
        if (c != 0) {
            int e = d / c;
            System.out.println("e = " + e);
        }

        System.out.println("프로그램 계속 진행.");

        // Exception(checked exception) (일반 예외)
        // try-catch 반드시 작성 (다른 방법도 존재)
        // Compiler가 Check

        // Runtime-Exception (unchecked exception) (실행 예외)
        // try-catch 필히 작성하지 않아도 된다.
        // Compiler가 Check 하지않는다.

    }
}
