package ch11.lecture;

public class App04 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 5;
            int c = b / a;
            System.out.println("프로그램 진행");
        } catch (ArithmeticException e) {
            // printStackTrace() : 예외 관련 정보 출력
            e.printStackTrace();
            System.out.println("예외 발생 시 실행되는 코드 실행");
        }

        System.out.println("이어서 진행되는 코드");
    }
}
