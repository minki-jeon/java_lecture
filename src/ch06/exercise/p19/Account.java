package ch06.exercise.p19;

public class Account {
    //* Reference : [Book. 이것이 자바다] p.282

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1_000_000;

    private int balance;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}
