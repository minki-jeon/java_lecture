package ch02.lecture;

import java.util.Scanner;

public class C19Scanner {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 커서를 이동하면서 입력된 값을 읽어냄
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();      // One-Line 입력된 텍스트 반환.
        System.out.println("s = " + s);
        String t = scanner.nextLine();      // One-Line 입력된 텍스트 반환.
        System.out.println("t = " + t);

        System.out.println("프로그램 종료");


    }
}
