package ch04.sec02;

public class IfExample {
    //* Reference : [Book. 이것이 자바다] p.113
    public static void main(String[] args) {
        int score = 93;
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B입니다.");            // if (score < 90) 조건 실행 영역이 아니다. 코드 블럭 없으므로
    }
}
