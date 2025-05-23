package ch11.lecture;

public class App18 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("코드 실행 이어감");
    }

    public static void method1() throws Exception {

        //  checked 예외 던지기 (발생)
        throw new Exception();
    }
}
