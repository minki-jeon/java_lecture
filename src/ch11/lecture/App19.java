package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (HungryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        throw new HungryException("저녁시간이라 배고파");
    }
}

// 필요에 의해 직접 Exception을 생성(구현)하여 사용 가능
class HungryException extends RuntimeException {
    // unchecked exception 생성
    HungryException() {
        // 기본 생성자 구현
        super("그냥 배고파");
    }

    HungryException(String message) {
        super(message);
    }

}
