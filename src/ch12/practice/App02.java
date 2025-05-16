package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        // 사용자로부터 입력받아
        // 한글 3글자 이상인지 확인하는 코드 작성
        Scanner sc = new Scanner(System.in);
        String regex = "[가-힣]{3,}";

        while (true) {
            System.out.print("입력> ");
            String str = sc.nextLine();

            if (Pattern.matches(regex, str)) {
                System.out.println("패턴 일치");
            } else {
                System.out.println("패턴 불일치");
            }
                
            System.out.println();
        }
    }
}
