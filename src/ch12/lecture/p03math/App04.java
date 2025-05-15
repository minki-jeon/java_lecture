package ch12.lecture.p03math;

import java.util.Random;
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        System.out.println("------ 가위바위보 게임 시작 -------");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. ✌️ 2. ✊ 3. ✋ 4.종료");
            System.out.print("입력> ");
            String user = sc.nextLine();
            int usr = Integer.parseInt(user);

            if (usr == 4) break;

            Random random = new Random();
            int pc = random.nextInt(3) + 1;
            switch (pc) {
                case 1 -> System.out.println("컴퓨터 : ✌️");
                case 2 -> System.out.println("컴퓨터 : ✊");
                case 3 -> System.out.println("컴퓨터 : ✋");
            }

            if (usr == pc) {
                // 비김
                System.out.println("🤝 비겼습니다.");

            } else if (usr == 1 && pc == 3) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else if (usr == 2 && pc == 1) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else if (usr == 3 && pc == 2) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else {
                // 짐
                System.out.println("😢 졌습니다.");
            }
        }
        System.out.println("게임 종료");
    }
}
