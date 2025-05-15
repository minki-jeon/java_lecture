package ch12.practice;

import java.io.IOException;
import java.util.Random;

public class App01 {
    public static void main(String[] args) throws IOException {
        // 가위바위보 (user vs pc)

        Random random = new Random();
        int keyCode = 0;
        int n = 1;
        String r = "가위";
        // 사용자 입력
        while (true) {
            // Enter 키를 읽지 않았을 경우에만 실행
            if (keyCode != 13 && keyCode != 10) {
                if (keyCode == 49) {
                    // 숫자 1 키
                    n = random.nextInt(3) + 1;
                    r = n == 1 ? "가위" : n == 2 ? "바위" : "보";

                    System.out.println("---------- 결과 -----------");
                    System.out.println("유저: 가위 - PC: " + r);
                    if (n == 1) System.out.println("비겼습니다.");
                    else if (n == 2) System.out.println("졌습니다.");
                    else if (n == 3) System.out.println("이겼습니다.");
                    else System.out.println(n);
                    System.out.println("--------------------------");
                } else if (keyCode == 50) {
                    // 숫자 2 키
                    n = random.nextInt(3) + 1;
                    r = n == 1 ? "가위" : n == 2 ? "바위" : "보";
                    System.out.println("---------- 결과 -----------");
                    System.out.println("유저: 바위 - PC: " + r);
                    if (n == 1) System.out.println("이겼습니다.");
                    else if (n == 2) System.out.println("비겼습니다.");
                    else if (n == 3) System.out.println("졌습니다.");
                    else System.out.println(n);
                    System.out.println("--------------------------");

                } else if (keyCode == 51) {
                    // 숫자 3 키
                    n = random.nextInt(3) + 1;
                    r = n == 1 ? "가위" : n == 2 ? "바위" : "보";
                    System.out.println("---------- 결과 -----------");
                    System.out.println("유저: 보 - PC: " + r);
                    if (n == 1) System.out.println("졌습니다.");
                    else if (n == 2) System.out.println("이겼습니다.");
                    else if (n == 3) System.out.println("비겼습니다.");
                    else System.out.println(n);
                    System.out.println("--------------------------");

                } else if (keyCode == 52) {
                    break;
                }

                System.out.println("--------------------------------");
                System.out.println("1. 가위 | 2. 바위 | 3. 보 | 4. 종료");
                System.out.println("--------------------------------");
                System.out.print("선택: ");
            }
            // 키를 하나씩 읽음 (int)
            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
