package ch11.sec06;

public class Account {
    //* Reference : [Book. 이것이 자바다] p.483
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 부족함");
        }
        balance -= money;
    }
}
