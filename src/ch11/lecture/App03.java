package ch11.lecture;

public class App03 {
    public static void main(String[] args) {
        try {
            int[] arr = {3, 4};
            System.out.println(arr[2]);

            System.out.println("프로그램 진행");
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            Throwable cause = e.getCause();
            System.out.println("message = " + message);
            System.out.println("cause = " + cause);
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement);
            }

            System.out.println("예외 발생 시, 실행되는 코드");
        }
        System.out.println("나머지 코드들...");
    }

}
