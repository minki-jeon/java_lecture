package ch04.sec03;

public class SwitchExpressionExample {
    //* Reference : [Book. 이것이 자바다] p.124
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
