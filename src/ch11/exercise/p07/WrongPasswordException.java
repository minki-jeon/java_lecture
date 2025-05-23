package ch11.exercise.p07;

public class WrongPasswordException extends Exception {
    //* Reference : [Book. 이것이 자바다] p.487
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
