package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    //* Reference : [Book. 이것이 자바다] p.133
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("-----------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------");
            System.out.print("선택: ");

            String strNum = scanner.nextLine();             // 입력 받은 값 저장

            // 입력값 1이면 속도증가, 2이면 속도감소, 3이면 종료
            if (strNum.equals("1")) {                       // 입력값 1일 때 실행 코드
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {                // 입력값 2일 때 실행 코드
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {                // 입력값 3일 때 실행 코드
                run = false;                                // 반복 중단
            }
        }
        System.out.println("프로그램 종료");
    }
}
