package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        // 사용자 입력받아서 유효한 전화번호인지 확인
        // 패턴 일치하는 번호들
        // 01099998888
        // 010-9999-8888
        // 010 9999 8889
        // 010-99998888
        // 010 99998888

        Scanner sc = new Scanner(System.in);
        String pattern = "(010)(-|\\s)?[0-9]{4}(-|\\s)?[0-9]{4}";

        while (true) {
            System.out.print("전화번호 입력> ");

            String input = sc.nextLine();

            if (Pattern.matches(pattern, input)) {
                System.out.println("패턴에 맞는 번호");
            } else {
                System.out.println("패턴에 맞지 않는 번호");
            }

        }

    }
}
