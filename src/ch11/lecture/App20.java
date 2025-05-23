package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws AngryException {
        throw new AngryException("직접 메시지 작성");
    }
}


class AngryException extends Exception {
    // checked exception 생성(구현)

    public AngryException() {
        super("기본 메시지");
    }

    public AngryException(String message) {
        super(message);
    }
}
