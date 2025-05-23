package ch11.sec06;

public class InsufficientException extends Exception {
    //* Reference : [Book. 이것이 자바다] p.482
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
