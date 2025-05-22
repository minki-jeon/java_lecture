package ch11.lecture;

public class App02 {
    public static void main(String[] args) {
        // try : Exception이 발생할 수 있는 코드
        // catch : Exception이 발생되면 실행되는 코드
        try {
            int a = 0;
            int b = 5;
            int c = b / a;      // ArithmeticException

            System.out.println("프로그램 진행");
        } catch (Exception e) {
            System.out.println("예외 발생 시, 실행되는 코드");
        }

        System.out.println("프로그램 나머지 코드들....");
    }
}
