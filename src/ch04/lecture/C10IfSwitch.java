package ch04.lecture;

import java.util.Scanner;

public class C10IfSwitch {
    public static void main(String[] args) {
        // switch 값 == 비교
        Scanner scanner = new Scanner(System.in);
        System.out.print("등급: ");
        String grade = scanner.nextLine();

        // if에 Hint(Alt+Enter)에서 switch로 자동 Replace할 수 있다.
//        if (grade.equals("A") || grade.equals("a")) {
//            System.out.println("최우수");
//        } else if (grade.equals("B") || grade.equals("b")) {
//            System.out.println("우수");
//        } else if (grade.equals("C") || grade.equals("c")) {
//            System.out.println("양호");
//        } else {
//            System.out.println("미흡");
//        }
        switch (grade) {
            case "A", "a" -> System.out.println("최우수");
            case "B", "b" -> System.out.println("우수");
            case "C", "c" -> System.out.println("양호");
            default -> System.out.println("미흡");
        }
    }
}
