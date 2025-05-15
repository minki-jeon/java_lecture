package ch12.lecture.p03math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        // 1 ~ 10 임의 숫자 3개 맞추기

        System.out.println("------ 1~10 사이의 숫자 3개 맞추기 ---------");

        Scanner sc = new Scanner(System.in);

        System.out.println("3개의 숫자를 ,로 구분해서 입력하세요.");
        System.out.print("입력> ");
        String line = sc.nextLine();
        String[] numbers = line.split(",");
        // 유저 숫자 3개 입력
        int[] nums = {
                Integer.parseInt(numbers[0]),
                Integer.parseInt(numbers[1]),
                Integer.parseInt(numbers[2])
        };

        // 랜덤 숫자 3개 반환
        int count = 0;
        int[] coms = new int[3];
        Random random = new Random();
        while (count < 3) {
            int r = random.nextInt(10) + 1;
            boolean isNum = false;
            for (int i = 0; i < coms.length; i++) {
                if (r == coms[i]) {
                    isNum = true;
                }
            }
            if (!isNum) {
                coms[count] = r;
                count++;
            }
        }

        // 중간 결과 출력
        System.out.println("사용자: " + Arrays.toString(nums));
        System.out.println("컴퓨터: " + Arrays.toString(coms));

        // 일치 개수 확인
        int sameNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < coms.length; j++) {
                if (nums[i] == coms[j]) {
                    sameNum++;
                }
            }
        }

        switch (sameNum) {
            case 3 -> System.out.println("1등! 3개 맞췄습니다.");
            case 2 -> System.out.println("2등! 2개 맞췄습니다.");
            case 1 -> System.out.println("3등! 1개 맞췄습니다.");
            case 0 -> System.out.println("아쉽게 맞추지 못했습니다.");

        }

        // 최종 결과 출력


        System.out.println("---------- 게임 종료 --------------");
    }
}
