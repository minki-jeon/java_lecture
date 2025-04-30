package ch04.sec03;

public class SwitchNoBreakCaseExample {
    //* Reference : [Book. 이것이 자바다] p.122
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;           //= 8, 9, 10, 11
        System.out.println("[현재 시간 : " + time + "시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의릅 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
        // case 조건에 맞게 실행한 후, break;가 없으면 그 아래 case도 조건 상관없이 실행된다.
    }
}
