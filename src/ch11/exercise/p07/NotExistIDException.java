package ch11.exercise.p07;

public class NotExistIDException extends Exception {
    //* Reference : [Book. 이것이 자바다] p.487
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
