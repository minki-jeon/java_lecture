package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {
    //* Reference : [Book. 이것이 자바다] p.141
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int bank = 0;

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 > ");
            String s = sc.nextLine();

            switch (s) {
                case "1" -> {
                    System.out.print("예금액 > ");
                    bank += Integer.parseInt(sc.nextLine());
                    System.out.print("잔고 > ");
                    System.out.println(bank);
                }
                case "2" -> {
                    System.out.print("출금액 > ");
                    bank -= Integer.parseInt(sc.nextLine());
                    System.out.print("잔고 > ");
                    System.out.println(bank);
                }
                case "3" -> {
                    System.out.print("잔고 > ");
                    System.out.println(bank);
                }
                case "4" -> run = false;
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        } // end while (run)
        System.out.println("프로그램 종료");
    }
}
