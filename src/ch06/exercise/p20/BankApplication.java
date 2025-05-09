package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    //* Reference : [Book. 이것이 자바다] p.283
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
        Scanner sc = new Scanner(System.in);

        int seq = 0;
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            int select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1 -> {
                    Account account = new Account();
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    account.setAccountNumber(sc.nextLine());

                    System.out.print("계좌주: ");
                    account.setName(sc.nextLine());

                    System.out.print("초기입금액: ");
                    account.setBalance(Integer.parseInt(sc.nextLine()));

                    accounts[seq] = account;
                    seq++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case 2 -> {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    for (int i = 0; i < seq; i++) {
                        System.out.println(accounts[i].getAccountNumber() + "    " + accounts[i].getName() + "    " + accounts[i].getBalance());
                    }
                }
                case 3 -> {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String number = sc.nextLine();
                    System.out.print("예금액: ");
                    int amount = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < seq; i++) {
                        if (number.equals(accounts[i].getAccountNumber())) {
                            int balance = accounts[i].getBalance() + amount;
                            accounts[i].setBalance(balance);
                            break;
                        }
                    }
                    System.out.println("결과: 예금이 성공되었습니다.");
                }
                case 4 -> {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String number = sc.nextLine();
                    System.out.print("출금액: ");
                    int amount = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < seq; i++) {
                        if (number.equals(accounts[i].getAccountNumber())) {
                            int balance = accounts[i].getBalance() - amount;
                            accounts[i].setBalance(balance);
                            break;
                        }
                    }
                    System.out.println("결과: 출금이 성공되었습니다.");
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
                default -> {
                    System.out.println("다시 선택하세요.");
                }
            }   // end switch (select)
        }   // end while (run)

    }
}
