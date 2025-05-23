package ch11.sec06;

public class AccountExample {
    //* Reference : [Book. 이것이 자바다] p.484
    public static void main(String[] args) {
        Account account = new Account();
        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
