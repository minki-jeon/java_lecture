package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    //* Reference : [Book. 이것이 자바다] p.468
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);                  // data.length() -> NullPointerException
        System.out.println("[프로그램 종료]");
    }
}
