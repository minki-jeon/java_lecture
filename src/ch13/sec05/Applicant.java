package ch13.sec05;

public class Applicant<T> {
    //* Reference : [Book. 이것이 자바다] p.586
    public T kind;

    // 기본생성자
    public Applicant() {
    }

    // 생성자
    public Applicant(T kind) {
        this.kind = kind;
    }

    // getter
    public T getKind() {
        return kind;
    }

    // setter
    public void setKind(T kind) {
        this.kind = kind;
    }
}
