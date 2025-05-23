package ch11.lecture;

public class App21 {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        // checked exception을 unchecked exception으로 감싸서 다시 던지기
        try {
            method1();
        } catch (Exception e) {     // checked exception
            e.printStackTrace();
            throw new RuntimeException(e);      // unchecked exception
        }

    }

    public static void method1() throws Exception {

    }
}
