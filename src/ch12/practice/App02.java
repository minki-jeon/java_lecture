package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        // 사용자로부터 입력받아
        // 한글 3글자 이상인지 확인하는 코드 작성
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[가-힣]{3,}";
        System.out.println(Pattern.matches(regex, str));
        
    }
}
